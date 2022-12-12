package com.example.manyToMany.service;

import com.example.manyToMany.entity.Book;

import java.util.List;

public interface BookService {
    Book saveBook(Book book);

   public List<Book> getAll();

    String deleteOne(int bookId);
}
