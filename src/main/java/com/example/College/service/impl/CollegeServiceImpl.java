package com.example.College.service.impl;

import com.example.College.entity.CollegeEntity;
import com.example.College.repository.CollegeRepository;
import com.example.College.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CollegeServiceImpl implements CollegeService {
    @Autowired
    public CollegeRepository collegeRepository;
    @Override
    public CollegeEntity saveCollege(CollegeEntity collegeEntity){return collegeRepository.save(collegeEntity);}
    @Override
    public List<CollegeEntity> getAll() {
        return collegeRepository.findAll();
    }
    @Override
    public String deleteAll(){collegeRepository.deleteAll();return null;}
    @Override
    public String deleteOne(int id) {
        collegeRepository.deleteById(id);
        return "deleted one";
    }
    @Override
    public Optional<CollegeEntity> UpdateData(CollegeEntity collegeEntity ){
        return Optional.of(collegeRepository.save(collegeEntity));
}}
