package com.spring.demo.controller;

import com.spring.demo.dto.BookDTO;
import com.spring.demo.services.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Controller
public class BookController {
    @Autowired
    private BookServiceImpl bookService;

    @PostMapping("/createBook")
    public ResponseEntity<BookDTO> createBook(@Valid @RequestBody BookDTO bookDTO) {
        BookDTO book = bookService.createBook(bookDTO);
        return ResponseEntity.ok().body(book);
    }
}
