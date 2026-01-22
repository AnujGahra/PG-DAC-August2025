// The method promise.then(), promise.catch() and promise.finally() can be used associated further action with a promise that becomes settled.
// Each .then() returns a newly generated promise object, which can optionally be used for chaining

const myPromise = new Promise((resolve, reject) => {
    setTimeout(() => {
        resolve('foo')
    }, 3000);
});

myPromise.then(
    (x) => { console.log("in A - " + x); }
).then(
    (x) => { console.log("in B - " + x); }
).then(
    (x) => { console.log("in B - " + x); }
)