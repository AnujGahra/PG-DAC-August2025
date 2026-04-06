const input = document.querySelector("#message-Input");
const chatContainer = document.querySelector("#chat-container");
const askbtn = document.querySelector("#ask");

console.log(input);



input.addEventListener("keyup",handleEnter);
askbtn.addEventListener("click",handleAsk);

function handleAsk(e){
    const text = input?.value.trim();
    if(!text) return;
    generate(text);
}

function  generate(text) {
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
}

function handleEnter(e){
    
    if(e.key === "Enter"){
        const text = input?.value.trim();
        if(!text) return;
        generate(text);
    }
}
