


// function logFetchURL(url) { // without async awaiy
//     return fetch(url)
//     .then(response => response.text())
//     .then(text => {
//         console.log(text);
//     })
//     .catch(err => {
//         console.log('fetch failed', err);
//     });
// }



// async function logFetchURL(URL) {
//     try {
        
//     } catch (error) {
        
//     }
// }


async function fetchData() {
    try {
        const response = await fetch('https://api.github.com/users/octocat');

        // Check if response is OK
        if (!response.ok) {
            throw new Error("Network response was not ok");
        }

        // Convert response to JSON
        const data = await response.json();

        console.log("Fetched Data:", data);

    } catch (error) {
        console.log("Fetch API failed due to some internal problem: " + error.message);
    }
}

fetchData();

console.log("Hello this is console for testing purpose");






// using arrow function 
const fetchData2 = async () => {
    try {
        const response = await fetch('https://api.github.com/users/octocat');

        // Check if response is OK
        if (!response.ok) {
            throw new Error("Network response was not ok");
        }

        // Convert response to JSON
        const data = await response.json();

        console.log("Fetched Data:", data);

    } catch (error) {
        console.log("Fetch API failed due to some internal problem: " + error.message);
    }
};

fetchData2();

console.log("Hello this is console for testing purpose");

