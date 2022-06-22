package com.spring.demo.controller;

import com.spring.demo.dto.BookDTO;
import com.spring.demo.services.BookServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class BookController {

    private final BookServiceImpl bookService;

    public BookController(BookServiceImpl bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/createBook")
    public ResponseEntity<BookDTO> createBook(@Valid @RequestBody BookDTO bookDTO) {
        BookDTO book = bookService.createBook(bookDTO);
        return ResponseEntity.ok().body(book);
    }
}
