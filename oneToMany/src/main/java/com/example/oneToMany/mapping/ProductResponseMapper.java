package com.example.oneToMany.mapping;

import com.example.oneToMany.entity.Customer;
import com.example.oneToMany.entity.Product;
import com.example.oneToMany.response.CustomerResponse;
import com.example.oneToMany.response.ProductResponse;

public class ProductResponseMapper extends AbstractMapper<Product, ProductResponse> {
    @Override
    public ProductResponse entityToModel(Product entity) {
        ProductResponse productResponse=new ProductResponse();
        productResponse.setProductName(entity.getProductName());
        productResponse.setQty(entity.getQty());
        productResponse.setPrice(entity.getPrice());
        return productResponse;
    }

    @Override
    public Product modelToEntity(ProductResponse model) {
        return null;
    }


}
