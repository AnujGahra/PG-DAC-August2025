
// Local Module
// const {add, sub, mul} = require('./math.js');
// console.log(add(5, 3));
// console.log(sub(5, 3));

// console.log(mul(5, 3));

// core module fs, http, os, stream, url 
// fs
const fs = require('fs');
// read file, write file, append file, delete file



// writefile using synchronous method


fs.writeFileSync('./data.txt', 'Hello World! This is synchronous file write operation zjksfas fajksf asf ags fagsuydfgauysgf uyas fyuasgfuas fasf.');




// append file using synchronous method
fs.appendFileSync('./data.txt', '\nThis is appended text using synchronous method.');

// read file using synchronous method
const data = fs.readFileSync('./data.txt', 'utf-8'); 
console.log(data);

// delete file using synchronous method 

fs.unlinkSync('./data.txt');

