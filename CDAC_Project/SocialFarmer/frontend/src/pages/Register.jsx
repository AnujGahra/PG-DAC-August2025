import { useState } from 'react';
import { useAuth } from '../context/AuthContext';
import { useNavigate, Link } from 'react-router-dom';
import { Container, Form, Button, Card, Alert } from 'react-bootstrap';

const Register = () => {
    const [formData, setFormData] = useState({
        fullName: '',
        phoneNumber: '',
        place: '',
        cropType: '',
        role: 'FARMER'
    });
    const [error, setError] = useState('');
    const [msg, setMsg] = useState('');
    const { register } = useAuth();
    const navigate = useNavigate();

    const handleChange = (e) => {
        setFormData({ ...formData, [e.target.name]: e.target.value });
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        setError('');
        setMsg('');
        try {
            const res = await register(formData);
            if (res.data.message) {
                setMsg(res.data.message);
                if (formData.role === 'ADMIN') {
                     // Auto login ? Or wait. Admin is auto approved.
                     setTimeout(() => navigate('/login'), 2000);
                }
            }
        } catch (err) {
            setError(err.response?.data?.message || 'Registration failed');
        }
    };

    return (
        <Container className="d-flex justify-content-center align-items-center" style={{ minHeight: '100vh' }}>
            <Card style={{ width: '400px' }} className="shadow-sm">
                <Card.Body>
                    <h2 className="text-center mb-4">Register</h2>
                    {error && <Alert variant="danger">{error}</Alert>}
                    {msg && <Alert variant="success">{msg}</Alert>}
                    <Form onSubmit={handleSubmit}>
                        <Form.Group className="mb-3">
                            <Form.Label>Full Name</Form.Label>
                            <Form.Control name="fullName" required onChange={handleChange} />
                        </Form.Group>
                        <Form.Group className="mb-3">
                            <Form.Label>Phone Number</Form.Label>
                            <Form.Control name="phoneNumber" required onChange={handleChange} />
                        </Form.Group>
                        <Form.Group className="mb-3">
                            <Form.Label>Place</Form.Label>
                            <Form.Control name="place" onChange={handleChange} />
                        </Form.Group>
                        <Form.Group className="mb-3">
                            <Form.Label>Crop Type (for Farmers)</Form.Label>
                            <Form.Control name="cropType" onChange={handleChange} />
                        </Form.Group>
                        <Form.Group className="mb-3">
                            <Form.Label>Role</Form.Label>
                            <Form.Select name="role" onChange={handleChange}>
                                <option value="FARMER">Farmer</option>
                                <option value="ADMIN">Admin</option>
                            </Form.Select>
                        </Form.Group>
                        <Button className="w-100" type="submit">Sign Up</Button>
                    </Form>
                    <div className="w-100 text-center mt-3">
                        Already have an account? <Link to="/login">Log In</Link>
                    </div>
                </Card.Body>
            </Card>
        </Container>
    );
};

export default Register;
