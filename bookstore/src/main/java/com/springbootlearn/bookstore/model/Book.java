package com.springbootlearn.bookstore.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Table
@Entity
@Getter
@Setter
@Data
@Builder
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String author;
    private Double price;
    private Integer stock;
}
