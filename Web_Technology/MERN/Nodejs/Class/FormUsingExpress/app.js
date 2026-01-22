const express = require('express');
const app = express();

const PORT = 8080;

app.get('/', (req, res) => {
    res.sendFile("input.html", { root: __dirname });
});

app.get('/processNos', (req, res) => {
    let n1 = parseFloat(req.query.no1);
    let n2 = parseFloat(req.query.no2);

    if (isNaN(n1) || isNaN(n2)) {
        return res.send("Please enter valid numbers.");
    }

    res.send("Addition of two numbers: " + (n1 + n2));
});

app.listen(PORT, () => {
    console.log(`Server is running successfully at PORT: ${PORT}`);
});
