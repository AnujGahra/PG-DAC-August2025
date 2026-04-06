import dotenv from "dotenv";
import express from "express";
import cors from "cors";
import { generate } from "./chatbot.js"; // ✅ FIX 1: Added .js extension (required for ESM modules)
dotenv.config();

const app = express();
const PORT = 3001;

app.use(cors());
app.use(express.json());

app.get("/", (req, res) => {
    res.send("Welcome to chatDB!");
});

app.post("/chat", async (req, res) => {
    const { message } = req.body;

    // ✅ FIX 2: Validate that message exists before calling generate
    if (!message) {
        return res.status(400).json({ error: "message field is required" });
    }

    console.log("User message:", message);

    // ✅ FIX 3: Wrap in try/catch so errors return JSON instead of hanging Postman
    try {
        const result = await generate(message);
        res.json({ message: result });
    } catch (error) {
        console.error("Error in /chat:", error);
        res.status(500).json({ error: "Something went wrong", details: error.message });
    }
});

app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});