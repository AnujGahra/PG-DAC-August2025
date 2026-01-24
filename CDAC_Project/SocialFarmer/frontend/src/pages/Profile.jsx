import { useEffect, useState } from 'react';
import { Container, Row, Col, Card } from 'react-bootstrap';
import api from '../api/axios';
import PostCard from '../components/PostCard';
import { useAuth } from '../context/AuthContext';

const Profile = () => {
    const { user } = useAuth();
    const [posts, setPosts] = useState([]);
    // const [profile, setProfile] = useState({}); // To implement: fetch user details

    useEffect(() => {
        api.get('/posts/my-posts').then(res => setPosts(res.data));
    }, []);

    return (
        <Container>
            <Row className="mb-4">
                <Col>
                    <Card className="text-center p-4">
                        <h2>{user?.sub}</h2> 
                        <p className="text-muted">{user?.role}</p>
                        {/* Add more profile details if backend endpoints available */}
                    </Card>
                </Col>
            </Row>
            <h3>My Posts</h3>
            <Row>
                <Col md={8} className="mx-auto">
                    {posts.map(post => (
                        <PostCard key={post.id} post={post} />
                    ))}
                </Col>
            </Row>
        </Container>
    );
};

export default Profile;
