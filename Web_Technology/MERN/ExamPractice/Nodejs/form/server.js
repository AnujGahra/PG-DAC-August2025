const http = require('http');
const fs = require('fs');
const path = require('path');
const querystring = require('querystring');

const server = http.createServer((req, res) => {
    
    // Serve index.html file
    if (req.url === '/' && req.method === 'GET') {
        const filePath = path.join(__dirname, 'index.html');
        fs.readFile(filePath, (err, data) => {
            res.writeHead(200, { "Content-Type": "text/html" });
            res.end(data);
        });
    }

    // Handle form submission
    else if (req.url === '/submit' && req.method === 'POST') {
        let body = '';

        // Collect data
        req.on('data', chunk => {
            body += chunk.toString();
        });

        // When all data is received
        req.on('end', () => {
            const formData = querystring.parse(body);

            res.writeHead(200, { "Content-Type": "text/html" });
            res.end(`
                <h1>Form Submitted Successfully!</h1>
                <p><strong>First Name:</strong> ${formData.firstname}</p>
                <p><strong>Last Name:</strong> ${formData.lastname}</p>
                <p><strong>Age:</strong> ${formData.age}</p>
            `);
        });
    }

    else {
        res.writeHead(404, { "Content-Type": "text/plain" });
        res.end("Page not found");
    }
});

server.listen(3000, () => {
    console.log("Server running on http://localhost:3000");
});
