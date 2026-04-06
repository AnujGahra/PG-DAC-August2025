const input = document.querySelector("#message-Input");
console.log(input);



input.addEventListener("keyup",handleEnter);

function  generate(text) {
    
}

function handleEnter(e){
    
    if(e.key === "Enter"){
        const text = input?.value.trim();
        if(!text) return;
        generate(text);
    }
}
