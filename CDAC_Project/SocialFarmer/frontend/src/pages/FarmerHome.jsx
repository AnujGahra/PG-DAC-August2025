import { useEffect, useState } from 'react';
import api from '../api/axios';
import { Container, Row, Col, Card, Form, Button } from 'react-bootstrap';
import CreatePost from '../components/CreatePost';
import PostCard from '../components/PostCard';

const FarmerHome = () => {
    const [posts, setPosts] = useState([]);
    const [search, setSearch] = useState('');

    const fetchPosts = async () => {
        try {
            const res = search 
                ? await api.get(`/posts/search?query=${search}`)
                : await api.get('/posts');
            setPosts(res.data);
        } catch (err) {
            console.error(err);
        }
    };

    useEffect(() => {
        fetchPosts();
    }, [search]);

    return (
        <Container>
            <Row className="justify-content-center">
                <Col md={8}>
                    <div className="mb-4">
                        <Form.Control 
                            type="text" 
                            placeholder="Search posts by crop, description..." 
                            value={search}
                            onChange={(e) => setSearch(e.target.value)}
                        />
                    </div>
                    <CreatePost refreshPosts={fetchPosts} />
                    <hr />
                    {posts.map(post => (
                        <PostCard key={post.id} post={post} />
                    ))}
                </Col>
            </Row>
        </Container>
    );
};

export default FarmerHome;
