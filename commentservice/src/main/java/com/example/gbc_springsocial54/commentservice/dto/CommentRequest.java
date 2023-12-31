package com.example.gbc_springsocial54.commentservice.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentRequest {
    @Id
    private String id;
    private String postId;
    private String userId;
    private String content;
}
