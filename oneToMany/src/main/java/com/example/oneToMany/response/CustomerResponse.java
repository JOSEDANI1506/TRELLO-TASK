package com.example.oneToMany.response;

import com.example.oneToMany.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CustomerResponse {
    private int id;
    private String name;
    private String email;
    private String gender;
    private  List<Product>product;

    public CustomerResponse(){

    }
}
