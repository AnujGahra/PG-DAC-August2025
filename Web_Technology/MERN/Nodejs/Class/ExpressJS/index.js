const express = require('express');
const app = express();
const PORT = 8080;

app.get('/', (req, res) => {
    res.send('Hello, This is Home Page');
});

app.get('/details', (req, res) => {
    res.send('Hello, This is Details Page');
});

app.get('/about', (req, res) => {
    res.send('Hello, This is About Page');
});

app.get("/welcome", (req, res) => {
    res.sendFile("Welcome.html",  { root: __dirname })
})


app.listen(PORT, (err) => {
    if (err) {
        console.log('something ent wrong', err)
    } else {
        console.log(`Server is running at PORT: ${PORT}`)
    }
});
