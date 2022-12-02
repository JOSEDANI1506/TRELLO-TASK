package com.example.oneToMany.service;

import com.example.oneToMany.entity.Customer;
import com.example.oneToMany.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product saveProduct(Product product) ;


        List<Product>getAll();

        String deleteOne(int pid);

        Optional<Product> UpdateData(Product product);
}
