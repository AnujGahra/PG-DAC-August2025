import dotenv from "dotenv";
import OpenAI from "openai";
dotenv.config();

async function run() {
    const client = new OpenAI({
        apiKey: process.env.GROQ_API_KEY,
        baseURL: "https://api.groq.com/openai/v1",
    });

    const response = await client.responses.create({
        model: "openai/gpt-oss-20b",
        temperature: 0,
        input: [
            {
                role: "system",
                content: `You are a smart personal assistant who answer the asked questions.
                You have access to following tools:
                1. searchWeb{query}: {query: string} - Search the latest information and realtime data on the internet
                `,
            },
            {
                role: "user",
                content: "When was the iPhone 16 launched?",
            }
        ],
        tools: [
            {
                "type": "function",
                "function": {
                    "name": "webSearch",
                    "description": "Search the latest information and realtime data on the internet",
                    "parameters": {
                        // JSON Schema object
                        "type": "object",
                        "properties": {
                            "query": {
                                "type": "string",
                                "description": "The search query to perform search on."
                            },
                        },
                        "required": ["query"]
                    }
                }
            }
        ],
        tool_choice: 'auto',
    });

    const toolCalls = response.tool_calls || [];
    if(!toolCalls) {
        console.log(`Assistant: ${response.output_text}`);
        return;
    }

    for(const tool of toolCalls) {
        console.log('tool: ', tool);
        const functionName = tool.function.name;
        const args = tool.function.arguments;


        if(functionName === 'webSearch') {
            const toolResult = await webSearch(JSON.parse(args));
            console.log('ToolResult: ', toolResult);
        }
        
    }


    console.log(response.output_text);
}

run();


// websearch function

async function webSearch({ query }) {
    // Here we will do tavily api call
    console.log("Calling web search");
    


    return 'Iphonr was launched on 20 september 2024';
}