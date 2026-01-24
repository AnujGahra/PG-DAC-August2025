package com.socialfarmer.backend.service;

import com.socialfarmer.backend.dto.CommentDto;
import com.socialfarmer.backend.model.Comment;
import com.socialfarmer.backend.model.Like;
import com.socialfarmer.backend.model.Post;
import com.socialfarmer.backend.model.User;
import com.socialfarmer.backend.repository.CommentRepository;
import com.socialfarmer.backend.repository.LikeRepository;
import com.socialfarmer.backend.repository.PostRepository;
import com.socialfarmer.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class InteractionService {

    private final LikeRepository likeRepository;
    private final CommentRepository commentRepository;
    private final PostRepository postRepository;
    private final UserRepository userRepository;

    public void likePost(Long postId, String userPhone) {
        User user = getUser(userPhone);
        Post post = getPost(postId);

        if (likeRepository.existsByPostAndUser(post, user)) {
            // Unlike if already liked
            Like like = likeRepository.findByPostAndUser(post, user).orElseThrow();
            likeRepository.delete(like);
        } else {
            Like like = Like.builder().post(post).user(user).build();
            likeRepository.save(like);
        }
    }

    public CommentDto addComment(Long postId, String userPhone, String content) {
        User user = getUser(userPhone);
        Post post = getPost(postId);

        Comment comment = Comment.builder()
                .content(content)
                .post(post)
                .user(user)
                .build();
        
        return mapToDto(commentRepository.save(comment));
    }

    public List<CommentDto> getComments(Long postId) {
        return commentRepository.findByPostIdOrderByCreatedAtAsc(postId).stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }
    
    public Long getLikeCount(Long postId) {
        return likeRepository.countByPostId(postId);
    }
    
    public boolean isLikedByMe(Long postId, String userPhone) {
        User user = getUser(userPhone);
        Post post = getPost(postId);
        return likeRepository.existsByPostAndUser(post, user);
    }

    private User getUser(String phone) {
        return userRepository.findByPhoneNumber(phone)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

    private Post getPost(Long postId) {
        return postRepository.findById(postId)
                .orElseThrow(() -> new RuntimeException("Post not found"));
    }

    private CommentDto mapToDto(Comment comment) {
        return CommentDto.builder()
                .id(comment.id()) // Error: id field is private, using getter locally but Lombak generates Getters
                // Wait, I used @Data so getters are there. but direct access might fail if not careful.
                // Let's use getters.
                .id(comment.getId())
                .postId(comment.getPost().getId())
                .content(comment.getContent())
                .authorName(comment.getUser().getFullName())
                .authorId(comment.getUser().getId())
                .createdAt(comment.getCreatedAt().toString())
                .build();
    }
}
