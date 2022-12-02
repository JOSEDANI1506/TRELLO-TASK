package com.example.oneToMany.mapping;

import com.example.oneToMany.entity.Customer;
import com.example.oneToMany.entity.Product;
import com.example.oneToMany.request.CustomerRequest;

import java.util.List;

public class CustomerRequestMapper extends AbstractMapper<Customer, CustomerRequest> {
    @Override
    public CustomerRequest entityToModel(Customer entity){return null;}
    @Override
    public Customer modelToEntity(CustomerRequest model){

        Customer customer=new Customer();
        customer.setName(model.getName());
        customer.setEmail(model.getEmail());
        customer.setGender(model.getGender());
        customer.setProduct(model.getProduct());
        model.getProduct().forEach(product ->product.setCustomer(customer));
        return customer;
    }

}
