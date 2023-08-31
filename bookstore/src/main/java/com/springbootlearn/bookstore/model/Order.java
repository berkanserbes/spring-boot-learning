package com.springbootlearn.bookstore.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table
@Entity(name = "BookOrder")
@Getter
@Setter
@Data
@Builder   // Builder design patterni
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String userName;
    private Double totalPrice;
    private List<Integer> bookList;

}
