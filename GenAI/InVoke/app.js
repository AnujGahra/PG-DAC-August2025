import dotenv from "dotenv";
import OpenAI from "openai";

dotenv.config();

async function run() {
    const client = new OpenAI({
        apiKey: process.env.GROQ_API_KEY,
        baseURL: "https://api.groq.com/openai/v1",
    });

    const response = await client.responses.create({
        temperature: 1, // Controls the randomness of the output. Higher values (e.g., 0.8) make the output more random, while lower values (e.g., 0.2) make it more focused and deterministic.
        top_p: 1, // Controls the diversity of the output. Higher values (e.g., 0.9) allow for more diverse outputs, while lower values (e.g., 0.5) make the output more focused on the most likely options.
        stop:'', // A string or array of strings that, when encountered in the output, will cause the model to stop generating further text.
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