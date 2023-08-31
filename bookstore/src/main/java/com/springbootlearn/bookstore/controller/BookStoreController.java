package com.springbootlearn.bookstore.controller;

import com.springbootlearn.bookstore.dto.BookOrderRequest;
import com.springbootlearn.bookstore.model.Order;
import com.springbootlearn.bookstore.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/bookstore")
public class BookStoreController {

    private final OrderService orderService;

    public BookStoreController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello Spring!");
    }

    @PostMapping
    public ResponseEntity<Order> putAnOrder(@RequestBody BookOrderRequest bookOrderRequest) {
        Order order = orderService.putAnOrder(bookOrderRequest.getBookIdList(), bookOrderRequest.getUserName());

        return ResponseEntity.ok(order);
    }

    /*
        @RequestBody annotation'ı bir HTTP isteği (örneğin, POST veya PUT isteği)
        sırasında gönderilen verileri almak için kullanılır ve bu verileri belirtilen
        Java nesnesine dönüştürür. Bu, istemci tarafından gönderilen JSON veya XML gibi veri formatlarını
        Java nesnelerine dönüştürmek için oldukça yaygın bir kullanımdır.
    */
}
