import dotenv from "dotenv";
import OpenAI from "openai";
import { tavily } from "@tavily/core";
dotenv.config();

const tvly = tavily({ apiKey: process.env.TAVILY_API_KEY });

const client = new OpenAI({
    apiKey: process.env.GROQ_API_KEY,
    baseURL: "https://api.groq.com/openai/v1",
});

// ✅ FIXED: Use the current recommended model (llama3-groq-70b tool-use was shut down Jan 6, 2025)
const MODEL = "llama-3.3-70b-versatile";

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

export async function generate(userMessage) {
    const messages = [
        {
            role: "system",
            content: `
            You are a smart personal assistant.
        If you know the answer to a question, answer it directly in plain English.
        If the answer requires real-time, local, or up-to-date information, or if you don't know the answer, use the available tool.
        You have access to the following tool:
        webSearch(query: string): Use this to search the internet for current or unknown information.
        Decide when to use your own knowledge and when to use the tool.
        Do not mention the tool unless needed.
💡

        Example:
        Q: What is the capital of France?
        A: The capital of France is Paris.

        Q: What's the weather in Mumbai right now?
        A: (use the search tool to find the latest weather)

        Q: Who is the Prime Minister of India?
        A: The current Prime Minister of India is Narendra Modi.

        Q: Tell me the latest IT news.
        A: (use the search tool to get the latest news)

        current date and time: ${new Date().toUTCString()}
            `,
        },
        {
            role: "user",
            content: userMessage,
        },
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

    if (toolCalls.length === 0) {
        console.log(`Assistant: ${assistantMessage.content}`);
        return assistantMessage.content;
    }

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
    return finalAnswer;
}

// ─── Web Search Tool ──────────────────────────────────────────────────────────

async function webSearch({ query }) {
    console.log(`\nSearching web for: "${query}"`);
    const response = await tvly.search(query);
    return response.results.map((r) => r.content).join("\n\n");
}