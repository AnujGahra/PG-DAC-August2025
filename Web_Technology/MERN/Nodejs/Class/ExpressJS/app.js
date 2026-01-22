const express = require('express');
const app = express();
const PORT = 8080

const users = [
    { id: 1, userName: "Anuj", age: 23, email: "anuj@example.com" },
    { id: 2, userName: "Rahul", age: 25, email: "rahul@example.com" },
    { id: 3, userName: "Priya", age: 22, email: "priya@example.com" },
    { id: 4, userName: "Sneha", age: 24, email: "sneha@example.com" },
    { id: 5, userName: "Amit", age: 26, email: "amit@example.com" }
];

app.get('/users', (req, res, next) => {
    res.send(users)
    next()
});

app.get('/users/:id', (req, res) => {
    var id = req.params.id;
    for(user of users){
        if(user.id == id)
            res.send(user)
    }
});

app.use( (req, res) => {
    res.status(404).send("404 - Page Not Found");
});

app.listen(PORT, () => {
    console.log(`Server is running successfully at PORT: ${PORT}`)
});