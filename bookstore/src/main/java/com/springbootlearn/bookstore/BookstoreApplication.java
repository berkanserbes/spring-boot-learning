package com.springbootlearn.bookstore;

import com.springbootlearn.bookstore.model.Book;
import com.springbootlearn.bookstore.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {
	private final BookRepository bookRepository;

	public BookstoreApplication(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	// Bu metot, uygulama ayaga kalkarken calisir.
	@Override
	public void run(String... args) throws Exception {
		Book book1 = Book.builder()
				.name("Martilari Seven Adam")
				.author("Osho")
				.price(45.0)
				.stock(3)
				.build();

		Book book2 = Book.builder()
				.name("The Secret")
				.author("Rhonda Byrne")
				.price(90.0)
				.stock(5)
				.build();

		Book book3 = Book.builder()
				.name("Sinirsiz Güc")
				.author("Anthony Robbins")
				.price(120.0)
				.stock(1)
				.build();

		bookRepository.saveAll(Arrays.asList(book1, book2, book3));
	}
}
