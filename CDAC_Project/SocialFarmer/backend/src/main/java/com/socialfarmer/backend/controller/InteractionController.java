package com.socialfarmer.backend.controller;

import com.socialfarmer.backend.dto.CommentDto;
import com.socialfarmer.backend.service.InteractionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/interactions")
@RequiredArgsConstructor
public class InteractionController {

    private final InteractionService interactionService;

    @PostMapping("/{postId}/like")
    public ResponseEntity<Void> likePost(
            @PathVariable Long postId,
            Authentication authentication
    ) {
        interactionService.likePost(postId, authentication.getName());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{postId}/comments")
    public ResponseEntity<CommentDto> addComment(
            @PathVariable Long postId,
            @RequestBody Map<String, String> payload,
            Authentication authentication
    ) {
        String content = payload.get("content");
        return ResponseEntity.ok(interactionService.addComment(postId, authentication.getName(), content));
    }

    @GetMapping("/{postId}/comments")
    public ResponseEntity<List<CommentDto>> getComments(@PathVariable Long postId) {
        return ResponseEntity.ok(interactionService.getComments(postId));
    }

    @GetMapping("/{postId}/likes/count")
    public ResponseEntity<Long> getLikeCount(@PathVariable Long postId) {
        return ResponseEntity.ok(interactionService.getLikeCount(postId));
    }

    @GetMapping("/{postId}/likes/status")
    public ResponseEntity<Boolean> getLikeStatus(
            @PathVariable Long postId,
            Authentication authentication
    ) {
        return ResponseEntity.ok(interactionService.isLikedByMe(postId, authentication.getName()));
    }
}
