package com.example.oneToMany.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class ProductRequest {
    private int pid;
    private String productName;
    private int qty;
    private int price;

}
