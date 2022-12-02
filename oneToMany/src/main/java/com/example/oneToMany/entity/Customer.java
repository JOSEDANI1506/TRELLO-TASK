package com.example.oneToMany.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@Entity
@ToString(exclude = {"product"})
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "c_id")
    private int id;
    private String name;
    private String email;
    private String gender;
    @OneToMany(mappedBy ="customer",cascade=CascadeType.ALL)
    private List<Product> product;


}
