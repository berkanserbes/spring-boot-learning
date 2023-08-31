package com.springbootlearn.bookstore.repository;

import com.springbootlearn.bookstore.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
