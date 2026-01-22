const path = require('path');

console.log('Directory name: ', path.dirname(__filename));
console.log(__dirname);

console.log('File name:', path.basename(__filename));
console.log(__filename);


console.log('file extension: ', path.extname(__filename));



const joinPath = path.join('/user', 'documenst', 'node', 'projects');
console.log('Join Path: ',joinPath);


// for resolve path
const resolvePath = path.resolve('user', 'documents', 'node', 'projects');
console.log('Resolve Path: ',resolvePath);


const normalizePath = path.normalize('/user/.documents/../node/projects');
console.log('Normalize Path: ', normalizePath);