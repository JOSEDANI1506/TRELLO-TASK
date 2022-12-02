package com.example.oneToMany.repository;

import com.example.oneToMany.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    Optional<Customer> findByName(String name);
}
