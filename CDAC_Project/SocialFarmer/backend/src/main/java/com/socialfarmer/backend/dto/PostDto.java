package com.socialfarmer.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    private Long id;
    private String title;
    private String cropType;
    private String description;
    private String imageUrl;
    private String authorName; // Flattened for UI
    private Long authorId;
    private String createdAt;
}
