package com.example.oneToMany.service.impl;

import com.example.oneToMany.entity.Customer;
import com.example.oneToMany.repository.CustomerRepository;
import com.example.oneToMany.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    public CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }
    @Override
    public List<Customer> getAll(){
        return customerRepository.findAll();
    }
    @Override
    public String deleteOne(int id){
        customerRepository.deleteById(id);
        return "one data deleted";
    }
    @Override
    public Optional<Customer>UpdateData(Customer customer){
        return Optional.of(customerRepository.save(customer));
    }

    @Override
    public Optional<Customer> findByName(String name) {
        return customerRepository.findByName(name);
    }
}
