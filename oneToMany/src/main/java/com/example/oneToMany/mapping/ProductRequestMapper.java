package com.example.oneToMany.mapping;

import com.example.oneToMany.entity.Customer;
import com.example.oneToMany.entity.Product;
import com.example.oneToMany.request.CustomerRequest;
import com.example.oneToMany.request.ProductRequest;

public class ProductRequestMapper extends AbstractMapper<Product, ProductRequest> {
    @Override
    public ProductRequest entityToModel(Product entity){return null;}
    @Override
    public Product modelToEntity(ProductRequest model){
        System.out.println(model.getProductName());
      Product product=new Product();
        product.setProductName(model.getProductName());
        product.setQty(model.getQty());
        product.setPrice(model.getPrice());
        return product;
    }
}
