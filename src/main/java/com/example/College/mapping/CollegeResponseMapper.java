package com.example.College.mapping;

import com.example.College.entity.CollegeEntity;
import com.example.College.request.CollegeRequest;
import com.example.College.response.CollegeResponse;

public class CollegeResponseMapper extends AbstractMapper<CollegeEntity, CollegeResponse> {


    @Override
    public CollegeResponse entityToModel(CollegeEntity entity) {
        CollegeResponse collegeResponse= new CollegeResponse();
        collegeResponse.setId(entity.getId());
        collegeResponse.setStudName(entity.getStudName());
        collegeResponse.setStudDetails(entity.getStudDetails());
        collegeResponse.setPhoneNumber(entity.getPhoneNumber());
        return collegeResponse;
    }
    @Override
    public CollegeEntity modelToEntity(CollegeResponse model){return null;}
}
