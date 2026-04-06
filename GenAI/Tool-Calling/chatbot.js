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
            content: `You are a smart personal assistant. When you need current or 
real-time information, use the webSearch tool. Always answer based on the 
search results you receive.`,
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