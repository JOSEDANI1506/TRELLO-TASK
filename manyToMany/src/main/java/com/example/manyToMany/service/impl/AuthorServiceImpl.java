package com.example.manyToMany.service.impl;

import com.example.manyToMany.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.manyToMany.repository.AuthorRepository;
import com.example.manyToMany.service.AuthorService;

import java.util.List;

@Service
public class AuthorServiceImpl  implements AuthorService {
    @Autowired
    public AuthorRepository authorRepository;
    @Override
    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    @Override
    public String deleteOne(int authorId) {
        authorRepository.deleteById(authorId);
        return "one data deleted";
    }

}
