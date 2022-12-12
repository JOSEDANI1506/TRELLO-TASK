package com.example.manyToMany.mapping;

import com.example.manyToMany.entity.Author;
import com.example.manyToMany.request.AuthorRequest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class AuthorRequestMapper extends AbstractMapper<Author, AuthorRequest> {
    @Override
    public AuthorRequest entityToModel(Author entity) {
        return null;
    }

    @Override
    public Author modelToEntity(AuthorRequest model) {
        Author author=new Author();
        author.setAuthorId(model.getAuthorId());
        author.setAuthorName(model.getAuthorName());
        return author;
    }
}
