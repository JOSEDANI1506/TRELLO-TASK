package com.example.College.mapping;

import com.example.College.entity.CollegeEntity;
import com.example.College.request.CollegeRequest;

public abstract class AbstractMapper<E, M> {


    public abstract M entityToModel(E entity);
    public abstract E modelToEntity(M model);

}
