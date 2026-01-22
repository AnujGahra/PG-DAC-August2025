// core module http
const fs = require('fs');
const http = require('http');
const path = require('path');



// create a server
const server = http.createServer((req, res) => {

    // // Set response headers
    // res.writeHead(200, { 'Content-Type': 'text/plain' });

    // // res.setHeader('Content-Type', 'text/html');
    // // res.statusCode = 200;   // optional but recommended

    // // Send response data
    // // res.write('Hello, this is response from server!');
    // // res.end();
    // res.end('Hello, this is response from server!');

   
    // res.setHeader('Content-Type', 'application/json');
    // res.writeHead(200, { 'Content-Type': 'application/json' });
    
    // const data = {
    //     name: "Anuj",
    //     age: 22
    // };
    // const data = [
    //     { name: "Anuj", age: 22 },
    //     { name: "Rahul", age: 23 },
    //     { name: "Priya", age: 21 },
    //     { name: "Priya", age: 21 },
    //     { name: "Priya", age: 21 },
    //     { name: "Priya", age: 21 },
    //     { name: "Priya", age: 21 },
    // ];

    // res.end(JSON.stringify(data));

    const filePath = path.join(__dirname, 'index.html'); 

    fs.readFile(filePath, (err, data) => {
        if (err) {
            res.writeHead(500, { 'Content-Type': 'text/plain' });
            res.end('Error loading file');
            return;
        }

        res.writeHead(200, { 'Content-Type': 'text/html' });
        res.end(data);
    });


});


server.listen(3000, () => {
    console.log('Server is running at http://localhost:3000/');
});