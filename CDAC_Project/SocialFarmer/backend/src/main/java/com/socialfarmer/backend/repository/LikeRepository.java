package com.socialfarmer.backend.repository;

import com.socialfarmer.backend.model.Like;
import com.socialfarmer.backend.model.Post;
import com.socialfarmer.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface LikeRepository extends JpaRepository<Like, Long> {
    Optional<Like> findByPostAndUser(Post post, User user);
    Long countByPostId(Long postId);
    boolean existsByPostAndUser(Post post, User user);
}
