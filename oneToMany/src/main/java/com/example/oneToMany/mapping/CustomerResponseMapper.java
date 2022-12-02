package com.example.oneToMany.mapping;

import com.example.oneToMany.entity.Customer;
import com.example.oneToMany.entity.Product;
import com.example.oneToMany.response.CustomerResponse;

public class CustomerResponseMapper extends AbstractMapper<Customer, CustomerResponse> {
    @Override
    public CustomerResponse entityToModel(Customer entity){
        CustomerResponse customerResponse=new CustomerResponse();
        customerResponse.setId(entity.getId());
        customerResponse.setName(entity.getName());
        customerResponse.setEmail(entity.getEmail());
        customerResponse.setGender(entity.getGender());
        customerResponse.setProduct(entity.getProduct());
        return customerResponse;

    }

    @Override
    public Customer modelToEntity(CustomerResponse model) {
        return null;
    }
}
