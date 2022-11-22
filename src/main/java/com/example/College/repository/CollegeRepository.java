package com.example.College.repository;

import com.example.College.entity.CollegeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CollegeRepository extends JpaRepository<CollegeEntity,Integer> {
}
