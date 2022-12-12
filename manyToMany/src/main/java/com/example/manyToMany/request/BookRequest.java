package com.example.manyToMany.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookRequest {
    private int bookId;
    private String bookName;
}
