package com.example.manyToMany.mapping;

import com.example.manyToMany.entity.Author;
import com.example.manyToMany.response.AuthorResponse;
import org.springframework.stereotype.Component;

@Component
public class AuthorResponseMapper extends AbstractMapper<Author, AuthorResponse> {
    @Override
    public AuthorResponse entityToModel(Author entity) {
        AuthorResponse authorResponse=new AuthorResponse();
        authorResponse.setAuthorId(entity.getAuthorId());
        authorResponse.setAuthorName(entity.getAuthorName());
        return authorResponse;
    }

    @Override
    public Author modelToEntity(AuthorResponse model) {
        return null;
    }
}
