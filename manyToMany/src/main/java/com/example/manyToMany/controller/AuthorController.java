package com.example.manyToMany.controller;

import com.example.manyToMany.entity.Author;
import com.example.manyToMany.mapping.AuthorRequestMapper;
import com.example.manyToMany.mapping.AuthorResponseMapper;
import com.example.manyToMany.mapping.BookResponseMapper;
import com.example.manyToMany.request.AuthorRequest;
import com.example.manyToMany.response.AuthorResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.manyToMany.service.AuthorService;

import java.util.List;

@RestController
@RequestMapping("api/v1/author")
public class AuthorController {
    @Autowired
     public AuthorService authorService;

    @Autowired
    public AuthorResponseMapper authorResponseMapper;

    @Autowired
    public AuthorRequestMapper authorRequestMapper;

    @PostMapping
    public AuthorResponse saveAuthor(@RequestBody AuthorRequest authorRequest) {
        Author author = authorRequestMapper.modelToEntity(authorRequest);
        author = authorService.saveAuthor(author);
        AuthorResponse authorResponse = authorResponseMapper.entityToModel(author);
        return authorResponse;
    }
    @GetMapping
    public List<Author> getAll(){
        return authorService.getAll();
    }
    @DeleteMapping("/{authorId}")
    public String deleteOne(@PathVariable("authorId")int authorId) {
        authorService.deleteOne(authorId);
        return "deleted one";
    }
}
