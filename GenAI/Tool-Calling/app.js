import dotenv from "dotenv";
import OpenAI from "openai";
dotenv.config();

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
            content: "You are a helpful assistant.",
        },
        {
            role: "user",
            content: "What is the capital of France?",
        }
    ]
});

console.log(response.output_text);
