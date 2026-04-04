import dotenv from "dotenv";
import OpenAI from "openai";

dotenv.config();

async function run() {
    const client = new OpenAI({
        apiKey: process.env.GROQ_API_KEY,
        baseURL: "https://api.groq.com/openai/v1",
    });

    const response = await client.responses.create({
        model: "llama-3.3-70b-versatile",
        input: [
            {
                role: "system",
                content: "You are Jarvis Gahra, a smart assistant that helps answer questions and solve problems. You are helpful, creative, clever, and very friendly."
            },
            {
                role: "user",
                content: "who are you?"
            }
        ]
    });

    console.log(response.output_text);
}

run();