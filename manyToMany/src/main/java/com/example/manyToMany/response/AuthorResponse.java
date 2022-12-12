package com.example.manyToMany.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthorResponse {
    private int authorId;
    private String authorName;

    public AuthorResponse() {

    }
}
