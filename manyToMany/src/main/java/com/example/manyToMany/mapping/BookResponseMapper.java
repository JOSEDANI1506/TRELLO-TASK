package com.example.manyToMany.mapping;

import com.example.manyToMany.entity.Book;
import com.example.manyToMany.response.BookResponse;
import org.springframework.stereotype.Component;

@Component
public class BookResponseMapper extends AbstractMapper<Book, BookResponse> {
    @Override
    public BookResponse entityToModel(Book entity) {
        BookResponse bookResponse=new BookResponse();
        bookResponse.setBookId(entity.getBookId());
        bookResponse.setBookName(entity.getBookName());
        return bookResponse;
    }

    @Override
    public Book modelToEntity(BookResponse model) {
        return null;
    }
}
