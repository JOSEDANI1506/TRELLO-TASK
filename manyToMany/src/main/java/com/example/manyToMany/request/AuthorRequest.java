package com.example.manyToMany.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthorRequest {
    private int authorId;
    private String authorName;
}
