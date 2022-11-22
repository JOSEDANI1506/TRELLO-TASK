package com.example.College.controller;

import com.example.College.entity.CollegeEntity;
import com.example.College.mapping.CollegeRequsetMapper;
import com.example.College.mapping.CollegeResponseMapper;
import com.example.College.request.CollegeRequest;
import com.example.College.response.CollegeResponse;
import com.example.College.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/College")

public class CollegeController {
    @Autowired
    public CollegeService collegeService;
    @PostMapping("/")
    public CollegeResponse saveCollege(@RequestBody CollegeRequest collegeRequest) {
        CollegeEntity collegeEntity = new CollegeRequsetMapper().modelToEntity(collegeRequest);
        collegeEntity = collegeService.saveCollege(collegeEntity);
        CollegeResponse collegeResponse = new CollegeResponseMapper().entityToModel(collegeEntity);
        return collegeResponse;
    }


        @GetMapping("/")
        public List<CollegeEntity> getAll() {
            return collegeService.getAll();
        }

    @DeleteMapping("/")
    public String deleteAll() {
        collegeService.deleteAll();
        return "deleted";
    }

    @DeleteMapping("/{id}")
    public String deleteOne(@PathVariable("id") int id) {
        collegeService.deleteOne(id);
        return "deleted one ";
    }

    @PutMapping("/{id}")
    public CollegeEntity updateData( @PathVariable("id") int id, @RequestBody CollegeRequest collegeRequest) {
        collegeRequest.setId(id);
        CollegeEntity collegeEntity = new CollegeRequsetMapper().modelToEntity(collegeRequest);
        return collegeService.saveCollege(collegeEntity);
    }

    }


