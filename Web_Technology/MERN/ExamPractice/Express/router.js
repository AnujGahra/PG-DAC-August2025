const express = require('express');

const router = express.Router();


router.get('/home', (req, res) => {
    res.send('<h1>Welcome to the Home Page!</h1>');
})
router.post('/home', (req, res) => {
    res.send('<h1>Welcome to the Home Page! from Post mathod</h1>');
})


module.exports = router; 