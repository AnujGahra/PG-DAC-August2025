const http = require('http');

http.createServer((req, res) => {
    res.writeHead(200, {"content-type":'text/html'})
    res.write(`
        <form action="/submit" method="post">
        <input type="text" placeholder="enter name" name = name />
        <input type="text" placeholder="email name" name = email />
        <button>Submit</button>
        </form>
        `);
        res.end();
}).listen(3200);