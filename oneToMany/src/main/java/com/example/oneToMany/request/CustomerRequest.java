package com.example.oneToMany.request;

import com.example.oneToMany.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor

public class CustomerRequest {
    private int id;
    private String name;
    private String email;
    private String gender;
    private List<Product> product;
}
