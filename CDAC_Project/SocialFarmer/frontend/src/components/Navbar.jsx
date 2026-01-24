import { Navbar, Nav, Container, Button } from 'react-bootstrap';
import { Link, useNavigate } from 'react-router-dom';
import { useAuth } from '../context/AuthContext';

const Navigation = () => {
    const { user, logout } = useAuth();
    const navigate = useNavigate();

    const handleLogout = () => {
        logout();
        navigate('/login');
    };

    return (
        <Navbar bg="success" variant="dark" expand="lg">
            <Container>
                <Navbar.Brand as={Link} to="/">Social Farmer</Navbar.Brand>
                <Navbar.Toggle aria-controls="basic-navbar-nav" />
                <Navbar.Collapse id="basic-navbar-nav">
                    <Nav className="me-auto">
                        {user?.role === 'FARMER' && <Nav.Link as={Link} to="/">Home</Nav.Link>}
                        {user?.role === 'ADMIN' && <Nav.Link as={Link} to="/admin">Dashboard</Nav.Link>}
                        <Nav.Link as={Link} to="/profile">Profile</Nav.Link>
                    </Nav>
                    <Nav>
                        <Button variant="outline-light" onClick={handleLogout}>Logout</Button>
                    </Nav>
                </Navbar.Collapse>
            </Container>
        </Navbar>
    );
};

export default Navigation;
