package com.example.College.service;

import com.example.College.entity.CollegeEntity;

import java.util.List;
import java.util.Optional;

public interface CollegeService {
    CollegeEntity saveCollege(CollegeEntity collegeEntity);
    List<CollegeEntity> getAll();

    public String deleteAll();

    String deleteOne(int id);
    Optional<CollegeEntity> UpdateData(CollegeEntity collegeEntity);
}
