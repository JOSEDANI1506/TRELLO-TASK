package com.example.oneToMany.response;

import com.example.oneToMany.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor

public class ProductResponse {
    private String productName;
    private int qty;
    private int price;

    public ProductResponse() {

    }
}
