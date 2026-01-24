import { useState, useEffect } from 'react';
import { Card, Button, Form, Image } from 'react-bootstrap';
import api from '../api/axios';

const PostCard = ({ post }) => {
    const [likes, setLikes] = useState(0);
    const [liked, setLiked] = useState(false);
    const [comments, setComments] = useState([]);
    const [newComment, setNewComment] = useState('');
    const [showComments, setShowComments] = useState(false);

    useEffect(() => {
        // Fetch like status and count
        api.get(`/interactions/${post.id}/likes/count`).then(res => setLikes(res.data));
        api.get(`/interactions/${post.id}/likes/status`).then(res => setLiked(res.data));
    }, [post.id]);

    const handleLike = async () => {
        try {
            await api.post(`/interactions/${post.id}/like`);
            setLiked(!liked);
            setLikes(prev => liked ? prev - 1 : prev + 1);
        } catch (err) {
            console.error(err);
        }
    };

    const fetchComments = async () => {
        if (!showComments) {
            const res = await api.get(`/interactions/${post.id}/comments`);
            setComments(res.data);
        }
        setShowComments(!showComments);
    };

    const handleComment = async (e) => {
        e.preventDefault();
        try {
            const res = await api.post(`/interactions/${post.id}/comments`, { content: newComment });
            setComments([...comments, res.data]);
            setNewComment('');
        } catch (err) {
            console.error(err);
        }
    };

    return (
        <Card className="mb-3 shadow-sm rounded">
            <Card.Body>
                <div className="d-flex align-items-center mb-2">
                    <div className="fw-bold">{post.authorName}</div>
                    <small className="text-muted ms-auto">{new Date(post.createdAt).toLocaleDateString()}</small>
                </div>
                <Card.Title>{post.title}</Card.Title>
                <Card.Subtitle className="mb-2 text-muted">{post.cropType}</Card.Subtitle>
                <Card.Text>{post.description}</Card.Text>
                {post.imageUrl && <Image src={post.imageUrl} fluid className="mb-3 rounded" style={{maxHeight:'300px', width:'100%', objectFit:'cover'}} />}
                
                <div className="d-flex gap-2">
                    <Button variant={liked ? "primary" : "outline-primary"} size="sm" onClick={handleLike}>
                        {likes} Likes
                    </Button>
                    <Button variant="outline-secondary" size="sm" onClick={fetchComments}>
                        Comments
                    </Button>
                </div>

                {showComments && (
                    <div className="mt-3">
                        {comments.map(c => (
                            <div key={c.id} className="bg-light p-2 mb-1 rounded">
                                <strong>{c.authorName}: </strong> {c.content}
                            </div>
                        ))}
                        <Form onSubmit={handleComment} className="mt-2 d-flex gap-2">
                            <Form.Control 
                                size="sm" 
                                placeholder="Add a comment..." 
                                value={newComment} 
                                onChange={e => setNewComment(e.target.value)} 
                            />
                            <Button size="sm" type="submit">Post</Button>
                        </Form>
                    </div>
                )}
            </Card.Body>
        </Card>
    );
};

export default PostCard;
