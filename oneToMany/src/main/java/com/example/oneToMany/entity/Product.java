package com.example.oneToMany.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@Table(name = "product_details")
@ToString(exclude = {"customer"})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pid;
    private String productName;
    private int qty;
    private int price;

    @ManyToOne(cascade=CascadeType.ALL)
    @JsonBackReference
    private Customer customer;

}
