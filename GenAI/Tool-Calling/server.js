import dotenv from "dotenv";
import express from "express";
import cors from "cors";
import { generate, clearMemory, getMemory } from "./chatbot.js";
dotenv.config();

const app = express();
const PORT = 3001;

app.use(cors());
app.use(express.json());

app.get("/", (req, res) => {
    res.send("Welcome to chatDB!");
});

app.post("/chat", async (req, res) => {
    const { message, threadId } = req.body;

    if (!message) {
        return res.status(400).json({ error: "message is required" });
    }

    // ✅ FIX 13: Don't reject if threadId missing — generate a fallback so
    //    the server never crashes even if an older client forgets to send it
    const resolvedThreadId = threadId || "default";

    console.log(`[Thread: ${resolvedThreadId}] User: ${message}`);

    try {
        const result = await generate(message, resolvedThreadId);
        res.json({ message: result, threadId: resolvedThreadId });
    } catch (error) {
        console.error("Error in /chat:", error);
        res.status(500).json({ error: "Something went wrong", details: error.message });
    }
});

// ✅ FIX 14: Add memory routes for clear and inspect
// DELETE /chat/:threadId/memory  — wipe memory, start a fresh conversation
app.delete("/chat/:threadId/memory", (req, res) => {
    clearMemory(req.params.threadId);
    res.json({ message: `Memory cleared for thread: ${req.params.threadId}` });
});

// GET /chat/:threadId/memory  — inspect stored history (useful for debugging)
app.get("/chat/:threadId/memory", (req, res) => {
    const memory = getMemory(req.params.threadId);
    res.json({
        threadId: req.params.threadId,
        turns: memory.length,
        history: memory,
    });
});

app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});