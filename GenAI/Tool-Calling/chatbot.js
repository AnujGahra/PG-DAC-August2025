import dotenv from "dotenv";
import OpenAI from "openai";
import NodeCache from "node-cache";
import { tavily } from "@tavily/core";
dotenv.config();

const tvly = tavily({ apiKey: process.env.TAVILY_API_KEY });

const client = new OpenAI({
    apiKey: process.env.GROQ_API_KEY,
    baseURL: "https://api.groq.com/openai/v1",
});

const cache = new NodeCache({ stdTTL: 3600 * 24 });

const MODEL = "llama-3.3-70b-versatile";

// ✅ FIX 7: Moved system prompt outside generate() as a clean constant.
//    Removed stray 💡 emoji that was breaking the string.
//    Date is injected fresh each call via a getter function below.
function getSystemPrompt() {
    return `You are a smart personal assistant with memory of past conversations.
You remember details the user has shared (their name, preferences, location, etc.)
and refer back to them naturally when relevant.

If you know the answer to a question, answer it directly in plain English.
If the answer requires real-time, local, or up-to-date information, or if you 
don't know the answer, use the webSearch tool.

Do not mention the tool to the user unless necessary.

Examples:
Q: What is the capital of France?
A: The capital of France is Paris.

Q: What's the weather in Mumbai right now?
A: (use webSearch tool to find current weather)

Q: Tell me the latest IT news.
A: (use webSearch tool)

Current date and time: ${new Date().toUTCString()}`;
}

const tools = [
    {
        type: "function",
        function: {
            name: "webSearch",
            description: "Search the internet for latest and real-time information.",
            parameters: {
                type: "object",
                properties: {
                    query: {
                        type: "string",
                        description: "The search query string.",
                    },
                },
                required: ["query"],
                additionalProperties: false,
            },
        },
    },
];

export async function generate(userMessage, threadId) {
    // ✅ FIX 8: Load conversation history from cache using threadId.
    //    Falls back to empty array if no history yet (first message).
    const history = cache.get(threadId) || [];

    console.log(`[Thread: ${threadId}] History length: ${history.length} messages`);

    // ✅ FIX 9: Build full messages = fresh system prompt + past history + new user message.
    //    System prompt is NOT stored in cache so date/time stays accurate on every call.
    const messages = [
        { role: "system", content: getSystemPrompt() },
        ...history,
        { role: "user", content: userMessage },
    ];

    const response = await client.chat.completions.create({
        model: MODEL,
        temperature: 0,
        messages,
        tools,
        tool_choice: "auto",
        parallel_tool_calls: false,
    });

    const assistantMessage = response.choices[0].message;
    const toolCalls = assistantMessage.tool_calls || [];

    // ── Direct answer path (no tool needed) ─────────────────────────────────
    if (toolCalls.length === 0) {
        console.log(`Assistant: ${assistantMessage.content}`);

        // ✅ FIX 10: Save user + assistant turn into cache so next call has memory
        cache.set(threadId, [
            ...history,
            { role: "user", content: userMessage },
            { role: "assistant", content: assistantMessage.content },
        ]);

        return assistantMessage.content;
    }

    // ── Tool call path ───────────────────────────────────────────────────────
    messages.push(assistantMessage);

    for (const tool of toolCalls) {
        console.log(`\nTool called: ${tool.function.name}`);
        console.log(`Arguments  : ${tool.function.arguments}`);

        let args;
        try {
            args = JSON.parse(tool.function.arguments);
        } catch (e) {
            console.error("Failed to parse tool arguments:", tool.function.arguments);
            throw new Error("Model returned malformed tool arguments");
        }

        if (tool.function.name === "webSearch") {
            const toolResult = await webSearch(args);
            console.log("Tool result received, length:", toolResult.length);

            messages.push({
                role: "tool",
                tool_call_id: tool.id,
                content: toolResult,
            });
        }
    }

    const finalResponse = await client.chat.completions.create({
        model: MODEL,
        temperature: 0,
        messages,
    });

    const finalAnswer = finalResponse.choices[0].message.content;
    console.log(`\nAssistant: ${finalAnswer}`);

    // ✅ FIX 11: Save user + final answer into cache after tool call path too.
    //    Only store user/assistant roles — tool results are runtime data.
    cache.set(threadId, [
        ...history,
        { role: "user", content: userMessage },
        { role: "assistant", content: finalAnswer },
    ]);

    return finalAnswer;
}

// ✅ FIX 12: Export memory helpers so server.js can expose them as routes
export function clearMemory(threadId) {
    cache.del(threadId);
    console.log(`[Thread: ${threadId}] Memory cleared.`);
}

export function getMemory(threadId) {
    return cache.get(threadId) || [];
}

// ─── Web Search Tool ──────────────────────────────────────────────────────────

async function webSearch({ query }) {
    console.log(`\nSearching web for: "${query}"`);
    const response = await tvly.search(query);
    return response.results.map((r) => r.content).join("\n\n");
}