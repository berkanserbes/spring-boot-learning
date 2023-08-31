package com.springbootlearn.bookstore.repository;

import com.springbootlearn.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
