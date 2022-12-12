package com.example.manyToMany.controller;

import com.example.manyToMany.entity.Author;
import com.example.manyToMany.entity.Book;
import com.example.manyToMany.mapping.AuthorRequestMapper;
import com.example.manyToMany.mapping.AuthorResponseMapper;
import com.example.manyToMany.mapping.BookRequestMapper;
import com.example.manyToMany.mapping.BookResponseMapper;
import com.example.manyToMany.request.AuthorRequest;
import com.example.manyToMany.request.BookRequest;
import com.example.manyToMany.request.BookRequest;
import com.example.manyToMany.response.AuthorResponse;
import com.example.manyToMany.response.BookResponse;
import com.example.manyToMany.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/book")
public class BookController {
    @Autowired
    public BookService bookService;
    @Autowired
    public BookResponseMapper bookResponseMapper;
    @Autowired
    public  BookRequestMapper bookRequestMapper;


    @PostMapping
    public BookResponse saveBook(@RequestBody BookRequest bookRequest) {
        Book book =  bookRequestMapper.modelToEntity(bookRequest);
        book = bookService.saveBook(book);
        BookResponse bookResponse  = bookResponseMapper.entityToModel(book);
        return  bookResponse;
    }
    @GetMapping
    public List<Book> getAll(){

         return bookService.getAll();
    }

    @DeleteMapping("/{bookId}")
    public String deleteOne(@PathVariable("bookId")int bookId) {
        bookService.deleteOne(bookId);
        return "deleted one";
    }




}
