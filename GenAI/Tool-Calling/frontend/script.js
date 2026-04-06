const input = document.querySelector("#message-Input");
const chatContainer = document.querySelector("#chat-container");
const askbtn = document.querySelector("#ask");

console.log(input);



input.addEventListener("keyup", handleEnter);
askbtn.addEventListener("click", handleAsk);

async function handleAsk(e) {
    const text = input?.value.trim();
    if (!text) return;
    await generate(text);
}

async function generate(text) {
    /**
     * 1. append message to UI
     * 2. send it to the LLM
     * 3. Append response to UI
     */

    const msg = document.createElement("div");
    msg.className = `my-6 bg-neutral-800 p-3 rounded-xl ml-auto max-w-fit`;
    msg.textContent = text;
    chatContainer?.appendChild(msg);

    input.value = "";


    // call server
    const assistantMessage = await callServer(text);


    const assistantMsgElem = document.createElement("div");
    assistantMsgElem.className = `max-w-fit mb-2`;
    assistantMsgElem.textContent = assistantMessage;
    chatContainer?.appendChild(assistantMsgElem);
}

async function callServer(inputText) {
    const response = await fetch("http://localhost:3001/chat", {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify({ message: inputText }),
    });

    if (!response.ok) {
        throw new Error("Error generating the response.")
    }

    const result = await response.json();
    return result.message;
}

async function handleEnter(e) {

    if (e.key === "Enter") {
        const text = input?.value.trim();
        if (!text) return;
        await generate(text);
    }
}
