package com.example.oneToMany.service;

import com.example.oneToMany.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer saveCustomer(Customer customer);

    List<Customer>getAll();

    String deleteOne(int id);

    Optional<Customer>UpdateData(Customer customer);
    Optional<Customer> findByName(String name);
}
