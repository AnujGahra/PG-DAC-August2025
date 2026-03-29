const router = require('express').Router();
const {register,login} = require('../controllers/authController');

router.post('/register', register);
router.post('/login', login);

module.exports = router;

// routes/taskRoutes.js
const router = require('express').Router();
const auth = require('../middleware/auth');

const {createTask,getTasks,deleteTask} = require('../controllers/taskController');

router.post('/', auth, createTask);
router.get('/', auth, getTasks);
router.delete('/:id', auth, deleteTask);

module.exports = router;