const http = require('http')
const fs = require('fs')

const argv = process.argv;
const PORT = argv[2];

const server = http.createServer((req, res) => {
    fs.readFile('html/web.html', 'utf-8', (err, data) => {
        if(err) {
            res.writeHead(500, {"content-type":'text/plain'})
            res.write("Internal server error");
            res.end();
            return;
        }
        res.writeHead(200, {"content-type":'text/html'})
        res.write(data)
        res.end();
    });
});

server.listen(PORT, () => {
    console.log(`Server is running successfully at PORT: ${PORT}`);
    
})