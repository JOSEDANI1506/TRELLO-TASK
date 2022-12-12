package com.example.manyToMany.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
    private String bookName;
   @ManyToMany
    @JoinTable(name="books_authors",
           joinColumns = @JoinColumn(name="bookId"),
    inverseJoinColumns = @JoinColumn(name="authorId"))
   @JsonIgnoreProperties("books")
   private List<Author> authors=new ArrayList<>();
}

