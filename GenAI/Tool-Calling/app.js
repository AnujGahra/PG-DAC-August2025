import dotenv from "dotenv";
import OpenAI from "openai";
import { tavily } from "@tavily/core";
dotenv.config();

const tvly = tavily({ apiKey: process.env.TAVILY_API_KEY });

async function run() {
  const client = new OpenAI({
    apiKey: process.env.GROQ_API_KEY,
    baseURL: "https://api.groq.com/openai/v1",
  });

  // ✅ FIX 1: Use the correct message history array (supports multi-turn)
  const messages = [
    {
      role: "system",
      content: `You are a smart personal assistant who answers questions.
You have access to the following tools:
1. webSearch({query: string}) - Search the latest information and realtime data on the internet`,
    },
    {
      role: "user",
      content: "Who is Narendra Modi and what is the latest news about him?",
    },
  ];

  // ✅ FIX 2: Use client.chat.completions.create() — not client.responses.create()
  // ✅ FIX 3: Use `messages` field — not `input`
  // ✅ FIX 4: Use a valid Groq model name
  const response = await client.chat.completions.create({
    model: "llama-3.3-70b-versatile",
    temperature: 0,
    messages,
    tools: [
      {
        type: "function",
        function: {
          name: "webSearch", // ✅ FIX 5: Unified name (was "searchWeb" in prompt, "webSearch" in definition)
          description:
            "Search the latest information and realtime data on the internet",
          parameters: {
            type: "object",
            properties: {
              query: {
                type: "string",
                description: "The search query to perform search on.",
              },
            },
            required: ["query"],
          },
        },
      },
    ],
    tool_choice: "auto",
  });

  // ✅ FIX 6: Correctly extract message from Chat Completions response
  const assistantMessage = response.choices[0].message;
  const toolCalls = assistantMessage.tool_calls || [];

  // ✅ FIX 7: Correctly check for empty array (empty array is truthy, so !toolCalls was always false)
  if (toolCalls.length === 0) {
    console.log(`Assistant: ${assistantMessage.content}`);
    return;
  }

  // Append assistant's tool-call message to history
  messages.push(assistantMessage);

  // ✅ FIX 8: Send tool results back to the model to get a final answer (agentic loop)
  for (const tool of toolCalls) {
    console.log("Tool call:", tool);
    const functionName = tool.function.name;
    const args = JSON.parse(tool.function.arguments);

    if (functionName === "webSearch") {
      const toolResult = await webSearch(args);
      console.log("Tool result:", toolResult);

      // Append each tool result into message history so the model can use it
      messages.push({
        role: "tool",
        tool_call_id: tool.id,
        content: toolResult,
      });
    }
  }

  // ✅ FIX 9: Make a second API call so the model can compose a final answer using the tool results
  const finalResponse = await client.chat.completions.create({
    model: "llama-3.3-70b-versatile",
    temperature: 0,
    messages,
  });

  console.log(`\nAssistant: ${finalResponse.choices[0].message.content}`);
}

run();

// ─── Web Search Tool ──────────────────────────────────────────────────────────

async function webSearch({ query }) {
  console.log(`\nCalling webSearch with query: "${query}"`);
  const response = await tvly.search(query);

  const finalResult = response.results
    .map((result) => result.content)
    .join("\n\n");

  return finalResult;
}