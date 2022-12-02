package com.example.oneToMany.controller;

import com.example.oneToMany.entity.Customer;
import com.example.oneToMany.entity.Product;
import com.example.oneToMany.mapping.CustomerRequestMapper;
import com.example.oneToMany.mapping.CustomerResponseMapper;
import com.example.oneToMany.request.CustomerRequest;
import com.example.oneToMany.response.CustomerResponse;
import com.example.oneToMany.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/Customer")
public class CustomerController {
    @Autowired
    public CustomerService customerService;

    @PostMapping
    public CustomerResponse saveCustomer(@RequestBody CustomerRequest customerRequest){
      Customer customer=new CustomerRequestMapper().modelToEntity(customerRequest);
      customer=customerService.saveCustomer(customer);

      CustomerResponse customerResponse=new CustomerResponseMapper().entityToModel(customer);
      return customerResponse;


    }

    @GetMapping
    public List<Customer> getAll(){
        return customerService.getAll();
    }

    @GetMapping("/{name}")
    public Optional<Customer> getCustomerByName(@PathVariable String name){
       return customerService.findByName(name);
    }

    @DeleteMapping("/{id}")
    public String deleteOne(@PathVariable("id")int id){
        customerService.deleteOne(id);
        return "deleted one";

    }
    @PutMapping("/{id}")
    public Customer updateData(@PathVariable("id")int id,@RequestBody CustomerRequest customerRequest){

        Customer customer=new CustomerRequestMapper().modelToEntity(customerRequest);
        customer.setId(id);
        return customerService.saveCustomer(customer);
    }



}
