package com.example.oneToMany.mapping;

public abstract class AbstractMapper<E,M> {

    public abstract M entityToModel(E entity);
    public abstract E modelToEntity(M model);
}
