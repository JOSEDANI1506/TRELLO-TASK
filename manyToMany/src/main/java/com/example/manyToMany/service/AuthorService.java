package com.example.manyToMany.service;

import com.example.manyToMany.entity.Author;

import java.util.List;

public interface AuthorService {
     Author saveAuthor(Author author);


     List<Author> getAll();

    String deleteOne(int authorId);
}
