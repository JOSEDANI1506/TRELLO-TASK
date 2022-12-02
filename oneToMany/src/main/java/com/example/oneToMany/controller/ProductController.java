package com.example.oneToMany.controller;

import com.example.oneToMany.entity.Customer;
import com.example.oneToMany.entity.Product;
import com.example.oneToMany.mapping.CustomerRequestMapper;
import com.example.oneToMany.mapping.CustomerResponseMapper;
import com.example.oneToMany.mapping.ProductRequestMapper;
import com.example.oneToMany.mapping.ProductResponseMapper;
import com.example.oneToMany.request.CustomerRequest;
import com.example.oneToMany.request.ProductRequest;
import com.example.oneToMany.response.CustomerResponse;
import com.example.oneToMany.response.ProductResponse;
import com.example.oneToMany.service.CustomerService;
import com.example.oneToMany.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/Product")
public class ProductController {
    @Autowired
    public ProductService productService;

    @PostMapping
    public ProductResponse saveProduct(@RequestBody ProductRequest productRequest){
        Product product=new ProductRequestMapper().modelToEntity(productRequest);
        product=productService.saveProduct(product);
        ProductResponse productResponse=new ProductResponseMapper().entityToModel(product);
        return productResponse;
    }

    @GetMapping
    public List<Product> getAll(){
        return productService.getAll();
    }

    @DeleteMapping("/{pid}")
    public String deleteOne(@PathVariable("pid")int  pid){
        productService.deleteOne(pid);
        return "deleted one";
    }

    @PutMapping("/{pid}")
    public Product updateData(@PathVariable("pid")int pid,@RequestBody ProductRequest productRequest){

        Product product=new ProductRequestMapper().modelToEntity(productRequest);
        product.setPid(pid);
        return productService.saveProduct(product);
    }


    }

