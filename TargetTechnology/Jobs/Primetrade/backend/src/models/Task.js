const mongoose = require('mongoose');

const taskSchema = new mongoose.Schema({
  title: String,
  user: { type: mongoose.Schema.Types.ObjectId, ref: 'User' }
});

module.exports = mongoose.model('Task', taskSchema);

// middleware/auth.js
const jwt = require('jsonwebtoken');

module.exports = (req,res,next)=>{
  const token = req.headers.authorization?.split(' ')[1];
  if(!token) return res.status(401).json({msg:'No token'});

  try {
    const decoded = jwt.verify(token, process.env.JWT_SECRET);
    req.user = decoded;
    next();
  } catch(err){
    res.status(401).json({msg:'Invalid token'});
  }
};