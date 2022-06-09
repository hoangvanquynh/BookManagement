package com.spring.demo.services;

import com.spring.demo.dto.BookDTO;
import com.spring.demo.entities.Book;

import java.util.List;

public interface BookServices {
    BookDTO createBook(BookDTO bookDTO);
    Book updateBook(BookDTO bookDTO);
    List<Book> findAllBook();
    void deleteBookById(Long id);
    BookDTO findById(Long id);
}
