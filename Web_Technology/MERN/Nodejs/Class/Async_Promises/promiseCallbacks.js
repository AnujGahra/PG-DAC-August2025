const { error } = require("console");
const fs = require("fs");

function readAFile(path) {
    return new Promise((resolve, reject) => {
        fs.readFile(path, 'utf-8', (err, data) => {
            if(err) reject(error);
            return resolve(data)
        });
    });
}

readAFile("Home.txt")
.then(data => console.log(data)
).catch(err => console.log(err)
)