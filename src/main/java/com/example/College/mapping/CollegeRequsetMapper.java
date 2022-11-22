package com.example.College.mapping;

import com.example.College.entity.CollegeEntity;
import com.example.College.request.CollegeRequest;

public class CollegeRequsetMapper extends AbstractMapper<CollegeEntity,CollegeRequest> {


    @Override
    public CollegeRequest entityToModel(CollegeEntity entity) {
        return null;
    }

    @Override
    public CollegeEntity modelToEntity(CollegeRequest model) {
        CollegeEntity collegeEntity=new CollegeEntity();
        collegeEntity.setId(model.getId());
        collegeEntity.setStudName(model.getStudName());
        collegeEntity.setStudDetails(model.getStudDetails());
        collegeEntity.setPhoneNumber(model.getPhoneNumber());
        return collegeEntity;

    }
}
