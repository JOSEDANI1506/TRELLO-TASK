package com.example.manyToMany.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookResponse {
    private int bookId;
    private String bookName;

    public BookResponse() {

    }
}
