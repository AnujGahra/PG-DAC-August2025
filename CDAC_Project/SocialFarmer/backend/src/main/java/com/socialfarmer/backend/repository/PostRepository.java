package com.socialfarmer.backend.repository;

import com.socialfarmer.backend.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByOrderByCreatedAtDesc();
    List<Post> findByUserIdOrderByCreatedAtDesc(Long userId);
    
    // Search methods
    List<Post> findByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCaseOrCropTypeContainingIgnoreCase(String title, String description, String cropType);
}
