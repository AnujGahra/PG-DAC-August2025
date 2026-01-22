const express = require('express');
const routes = require('./router');

const app = express();

app.use(express.urlencoded({ extended: true }));
app.use(routes); // http://localhost:3000/home

function logger(req, res, next) {
    console.log(`${req.method} request received for ${req.url} at ${new Date().toISOString()}`);
    next();
}

// app.use(logger) // application-level middleware

app.get('/', logger, (req, res, next) => {
    res.sendFile(__dirname + '/index.html');
    next();
});



app.post('/', (req, res) => {
    res.send('<h1>Hello, this is response from Express server from post method!</h1>');
});

app.put('/', (req, res) => {
    res.send('<h1>Hello, this is response from Express server! from put method</h1>');
});

app.delete('/', (req, res) => {
    res.send('<h1>Hello, this is response from Express server! from delete method</h1>');
});

// handle form submit
app.post('/submit', (req, res) => {
    const { firstname, lastname, age } = req.body;

    res.send(`
        <h1>Form Data Received</h1>
        <p><b>First Name:</b> ${firstname}</p>
        <p><b>Last Name:</b> ${lastname}</p>
        <p><b>Age:</b> ${age}</p>
    `);
});


app.listen(3000, () => {
    console.log('Server is running on port 3000');
});



