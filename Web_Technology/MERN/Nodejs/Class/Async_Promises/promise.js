var promise = new Promise((resolve, reject) => {
    // code: executor code
    // SYTNAX
    // if(condition == true)
    //     resolve(res)
    // else 
    //     reject(err)

    var a = 10, b = 0;
    if(b != 0){
        var res = a/b;
        resolve("Output for promises: " + res)
    } else {
        reject(new Error("Div cannot be zeor!!!..."))
    }
});


// Consume a promise
// console.log(promise); // get output in object form
promise.then( // then method is also higher order function and it take 2 callback function
    res => console.log(res), 
    
).catch(
    err => console.log(err.message) // if i do not add .message then i will get error with full object when will i add err.message then i will get only error message
)
