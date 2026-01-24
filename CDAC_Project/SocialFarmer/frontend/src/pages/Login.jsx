import { useState } from 'react';
import { useAuth } from '../context/AuthContext';
import { useNavigate, Link } from 'react-router-dom';
import { Container, Form, Button, Card, Alert } from 'react-bootstrap';

const Login = () => {
    const [phone, setPhone] = useState('');
    const [otp, setOtp] = useState('');
    const [error, setError] = useState('');
    const { login } = useAuth();
    const navigate = useNavigate();

    const handleSubmit = async (e) => {
        e.preventDefault();
        setError('');
        try {
            await login(phone, otp);
            navigate('/');
        } catch (err) {
            setError(err.response?.data?.error || err.response?.data?.message || 'Login failed');
        }
    };

    return (
        <Container className="d-flex justify-content-center align-items-center" style={{ minHeight: '100vh' }}>
            <Card style={{ width: '400px' }} className="shadow-sm">
                <Card.Body>
                    <h2 className="text-center mb-4">Social Farmer Login</h2>
                    {error && <Alert variant="danger">{error}</Alert>}
                    <Form onSubmit={handleSubmit}>
                        <Form.Group id="phone" className="mb-3">
                            <Form.Label>Phone Number</Form.Label>
                            <Form.Control 
                                type="text" 
                                required 
                                value={phone} 
                                onChange={(e) => setPhone(e.target.value)} 
                                placeholder="Enter phone number"
                            />
                        </Form.Group>
                        <Form.Group id="otp" className="mb-3">
                            <Form.Label>OTP</Form.Label>
                            <Form.Control 
                                type="password" 
                                required 
                                value={otp} 
                                onChange={(e) => setOtp(e.target.value)} 
                                placeholder="Enter OTP (Use 1234)"
                            />
                        </Form.Group>
                        <Button className="w-100" type="submit">Log In</Button>
                    </Form>
                    <div className="w-100 text-center mt-3">
                        Need an account? <Link to="/register">Register</Link>
                    </div>
                </Card.Body>
            </Card>
        </Container>
    );
};

export default Login;
