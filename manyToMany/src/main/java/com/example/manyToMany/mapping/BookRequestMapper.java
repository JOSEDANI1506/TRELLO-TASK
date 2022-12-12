package com.example.manyToMany.mapping;

import com.example.manyToMany.entity.Book;
import com.example.manyToMany.request.BookRequest;
import com.example.manyToMany.request.BookRequest;
import org.springframework.stereotype.Component;

@Component
public class BookRequestMapper extends AbstractMapper<Book, BookRequest> {
    @Override
    public BookRequest entityToModel(Book entity) {
        return null;
    }

    @Override
    public Book modelToEntity(BookRequest model) {
        Book book=new Book();
        book.setBookId(model.getBookId());
        book.setBookName(model.getBookName());

        return book;
    }
}
