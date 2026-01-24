import { useEffect, useState } from 'react';
import { Container, Table, Button, Badge } from 'react-bootstrap';
import api from '../api/axios';

const AdminDashboard = () => {
    // Note: I need to add an endpoint to get all users for admin approval. 
    // I haven't added `AdminController` explicitly yet in backend. I should add `UserController` or `AdminController`.
    // I'll assume endpoint `/admin/users` exists and implement it in backend next step.
    const [users, setUsers] = useState([]);

    const fetchUsers = async () => {
        try {
            const res = await api.get('/admin/users');
            setUsers(res.data);
        } catch (err) {
            console.error(err);
        }
    };

    useEffect(() => {
        fetchUsers();
    }, []);

    const handleApprove = async (id, status) => {
        try {
            await api.put(`/admin/users/${id}/status`, null, { params: { status } });
            fetchUsers();
        } catch (err) {
            console.error(err);
        }
    };

    return (
        <Container>
            <h2 className="my-4">Admin Dashboard</h2>
            <Table striped bordered hover>
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Phone</th>
                        <th>Role</th>
                        <th>Status</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    {users.map(user => (
                        <tr key={user.id}>
                            <td>{user.fullName}</td>
                            <td>{user.phoneNumber}</td>
                            <td>{user.role}</td>
                            <td>
                                <Badge bg={user.status === 'APPROVED' ? 'success' : user.status === 'PENDING' ? 'warning' : 'danger'}>
                                    {user.status}
                                </Badge>
                            </td>
                            <td>
                                {user.status === 'PENDING' && (
                                    <>
                                        <Button variant="success" size="sm" className="me-2" onClick={() => handleApprove(user.id, 'APPROVED')}>Approve</Button>
                                        <Button variant="danger" size="sm" onClick={() => handleApprove(user.id, 'REJECTED')}>Reject</Button>
                                    </>
                                )}
                            </td>
                        </tr>
                    ))}
                </tbody>
            </Table>
        </Container>
    );
};

export default AdminDashboard;
