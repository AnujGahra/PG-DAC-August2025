const input = document.querySelector("#message-Input");
const chatContainer = document.querySelector("#chat-container");
const askbtn = document.querySelector("#ask");

// ✅ FIX 1: Generate a stable threadId for this browser session so the
//    server can scope memory to this user. Persists across page refreshes.
const threadId = sessionStorage.getItem("threadId") || crypto.randomUUID();
sessionStorage.setItem("threadId", threadId);

input.addEventListener("keyup", handleEnter);
askbtn.addEventListener("click", handleAsk);

async function handleAsk() {
    const text = input?.value.trim();
    if (!text) return;
    await generate(text);
}

async function handleEnter(e) {
    if (e.key === "Enter") {
        const text = input?.value.trim();
        if (!text) return;
        await generate(text);
    }
}

async function generate(text) {
    // Append user message to UI
    const msg = document.createElement("div");
    msg.className = "my-6 bg-neutral-800 p-3 rounded-xl ml-auto max-w-fit";
    msg.textContent = text;
    chatContainer?.appendChild(msg);
    input.value = "";

    // ✅ FIX 2: Create a fresh loading div per message — not one global one.
    //    The old approach would remove the wrong element if two messages were
    //    sent quickly.
    const loading = document.createElement("div");
    loading.className = "my-6 bg-neutral-800 p-3 rounded-xl max-w-fit animate-pulse";
    loading.textContent = "Thinking...";
    chatContainer?.appendChild(loading);

    // ✅ FIX 3: Auto-scroll so user always sees the latest message
    chatContainer.scrollTop = chatContainer.scrollHeight;

    try {
        // ✅ FIX 4: Pass threadId so server can load/save memory for this session
        const assistantMessage = await callServer(text, threadId);

        const assistantMsgElem = document.createElement("div");
        assistantMsgElem.className = "max-w-fit mb-2";
        assistantMsgElem.textContent = assistantMessage;
        loading.remove();
        chatContainer?.appendChild(assistantMsgElem);
    } catch (err) {
        // ✅ FIX 5: Show error in UI instead of silently freezing
        loading.textContent = "⚠️ Something went wrong. Please try again.";
        loading.classList.remove("animate-pulse");
        loading.classList.add("text-red-400");
        console.error("Chat error:", err);
    }

    // Scroll again after response renders
    chatContainer.scrollTop = chatContainer.scrollHeight;
}

async function callServer(inputText, threadId) {
    const response = await fetch("http://localhost:3001/chat", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        // ✅ FIX 6: Send threadId so server memory works
        body: JSON.stringify({ message: inputText, threadId }),
    });

    if (!response.ok) {
        throw new Error("Error generating the response.");
    }

    const result = await response.json();
    return result.message;
}