// Scope and clouser, HOF
// Closure = A function that remembers variables from its outer scope even after the outer function has finished executing.
// This is the most important concept for understanding JavaScript.
// let a = 10;
// const b = 20;

// if(true) {
//     console.log(b);
//     let d = 30;
//     var e = 90;
// }

// function greet() {
//     console.log(a);
// }
// console.log(e);
// console.log(d);

// greet();


// let global = 30;

// function greet() {
//     let global = 40;
//     function meet() {
//         function meet2() {
//             let global = 10;
//             console.log(global);
//         }
//         meet2();
//     }
//     meet()

// }
// greet();

function createCounter() {

    let count = 0;
    function increment() {
        // console.log("I am increment function")
        count++;
        return count;
        
    }

    // increment();
    return increment;
}

 
const count = createCounter(); 
console.log(count());
console.log(count());
console.log(count());
console.log(count());

