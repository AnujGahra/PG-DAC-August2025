import dotenv from "dotenv";
import OpenAI from "openai";

dotenv.config();

const client = new OpenAI({
    apiKey: process.env.GROQ_API_KEY,
    baseURL: "https://api.groq.com/openai/v1",
});

const response = await client.responses.create({
        temperature: 1, // Controls the randomness of the output. Higher values (e.g., 0.8) make the output more random, while lower values (e.g., 0.2) make it more focused and deterministic.
        // top_p: 1, // Controls the diversity of the output. Higher values (e.g., 0.9) allow for more diverse outputs, while lower values (e.g., 0.5) make the output more focused on the most likely options.
        // stop:'ga', // A string or array of strings that, when encountered in the output, w ill cause the model to stop generating further text.
        // max_output_tokens: '100', // The maximum number of tokens to generate in the output. This limits the length of the response.
        // frequency_penalty: 0, // Controls the likelihood of the model repeating the same line verbatim. Higher values (e.g., 0.5) make it less likely to repeat, while lower values (e.g., 0) allow for more repetition.
        // presence_penalty: 0, // Controls the likelihood of the model talking about new topics. Higher values (e.g., 0.5) make it more likely to talk about new topics, while lower values (e.g., 0) encourage sticking to existing topics.
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