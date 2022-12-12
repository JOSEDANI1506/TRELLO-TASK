package com.example.manyToMany.service.impl;

import com.example.manyToMany.service.BookService;
import com.example.manyToMany.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.manyToMany.repository.BookRepository;

import java.util.List;


@Service
public class BookServiceImpl implements BookService {
    @Autowired
    public BookRepository bookRepository;

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public String deleteOne(int bookId) {
    bookRepository.deleteById(bookId);
    return "one data deleted";
    }


}
