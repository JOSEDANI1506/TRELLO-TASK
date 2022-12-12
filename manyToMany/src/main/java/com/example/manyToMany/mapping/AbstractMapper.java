package com.example.manyToMany.mapping;

import org.springframework.stereotype.Component;

@Component
public abstract class AbstractMapper<E,M> {

    public abstract M entityToModel(E entity);

    public abstract E modelToEntity(M model);
}