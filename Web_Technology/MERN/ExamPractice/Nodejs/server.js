// fs module using asynchronous method
// const fs = require('fs');
// const os = require('os');
const path = require('path');
console.log('Current file path:', __filename);
console.log('Current directory path:', __dirname);

// write file using asynchronous method  

// console.log('Starting asynchronous file write operation...');


// fs.writeFile('./data.txt', "Hello Bhai! This is asynchronous file write oprtaion  ", (err) => {
//     if (err) console.log('Error writing file:', err);
//     console.log('File written successfully using asynchronous method.'); 
// });


// console.log('after file completed this line will be execute ');


//  append file using asynchronous method
// fs.appendFile('./data.txt', '\nThis is appended text using asynchoronous method.', (err) => {
//     if (err) console.log('Error appending file:', err);
//     console.log('File appended successfully using asynchronous method.');
// });

// read file using asynchronous method
// fs.readFile('./data.txt', 'utf-8', (err, data) => {
//     if (err) {
//         console.log('Error reading file:', err);
//     } else {
//         console.log('File content read using asynchronous method:');
//         console.log(data);
//     }
// });

// delete file using asynchronous method
// fs.unlink('./data.txt', (err) => {
//     if (err) console.log('Error deleting file:', err);
//     console.log('File deleted successfully using asynchronous method.');
// });

// console.log(os.platform());

// console.log(os.arch());
// console.log(os.cpus());
// console.log(os.hostname());
