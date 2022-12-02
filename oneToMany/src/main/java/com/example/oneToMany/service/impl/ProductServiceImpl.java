package com.example.oneToMany.service.impl;

import com.example.oneToMany.entity.Customer;
import com.example.oneToMany.entity.Product;
import com.example.oneToMany.repository.ProductRepository;
import com.example.oneToMany.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    public ProductRepository productRepository;
    @Override
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }
    @Override
    public List<Product> getAll() {

        return productRepository.findAll();
    }

    @Override
    public String deleteOne(int pid){
        productRepository.deleteById(pid);
        return "one Data Deleted";
    }

    @Override
    public Optional<Product> UpdateData(Product product) {
        return Optional.of(productRepository.save(product));
    }

}
