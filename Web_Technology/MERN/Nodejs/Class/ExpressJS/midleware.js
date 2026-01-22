const express = require('express');
const app = express();
const PORT = 3000;

// define middleware function
const myFirstMiddleware = (req, res, next) => {
    console.log("This first middleware run on every request");
    next();
}

app.use(myFirstMiddleware);

app.get('/', (req, res) => {
    res.send('Home Page')
})

app.get('/about', (req, res) => {
    res.send('About Page')
})


app.listen(PORT, (err) => {
    if (err) {
        console.log('something went wrong');
    } else {
        console.log(`Server is running at PORT: ${PORT}`)
    }
})