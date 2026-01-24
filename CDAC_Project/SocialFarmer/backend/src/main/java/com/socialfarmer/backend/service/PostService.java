package com.socialfarmer.backend.service;

import com.socialfarmer.backend.dto.PostDto;
import com.socialfarmer.backend.model.Post;
import com.socialfarmer.backend.model.User;
import com.socialfarmer.backend.repository.PostRepository;
import com.socialfarmer.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private final UserRepository userRepository;

    public PostDto createPost(String userPhone, PostDto request) {
        User user = userRepository.findByPhoneNumber(userPhone)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        
        Post post = Post.builder()
                .title(request.getTitle())
                .cropType(request.getCropType())
                .description(request.getDescription())
                .imageUrl(request.getImageUrl()) // Assuming image uploaded via controller/frontend first
                .user(user)
                .build();
        
        Post saved = postRepository.save(post);
        return mapToDto(saved);
    }

    public List<PostDto> getAllPosts() {
        return postRepository.findAllByOrderByCreatedAtDesc().stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    public List<PostDto> getMyPosts(String userPhone) {
        User user = userRepository.findByPhoneNumber(userPhone)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return postRepository.findByUserIdOrderByCreatedAtDesc(user.getId()).stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    public List<PostDto> searchPosts(String query) {
        return postRepository.findByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCaseOrCropTypeContainingIgnoreCase(query, query, query).stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    private PostDto mapToDto(Post post) {
        return PostDto.builder()
                .id(post.getId())
                .title(post.getTitle())
                .cropType(post.getCropType())
                .description(post.getDescription())
                .imageUrl(post.getImageUrl())
                .authorName(post.getUser().getFullName())
                .authorId(post.getUser().getId())
                .createdAt(post.getCreatedAt().toString())
                .build();
    }
}
