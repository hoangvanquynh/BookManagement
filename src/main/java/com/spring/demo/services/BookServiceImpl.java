package com.spring.demo.services;

import com.google.common.base.Strings;
import com.spring.demo.dao.AuthorRepository;
import com.spring.demo.dao.BookRepository;
import com.spring.demo.dto.BookDTO;
import com.spring.demo.entities.Book;
import com.spring.demo.exception.ManagementException;
import com.spring.demo.mapper.BookMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookServices{

    private final BookRepository bookRepository;

    private final AuthorRepository authorRepository;

    private final BookMapper bookMapper;

    public BookServiceImpl(BookRepository bookRepository, AuthorRepository authorRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.bookMapper = bookMapper;
    }


    @Override
    public BookDTO createBook(BookDTO bookDTO) {
        validBookDTO(bookDTO);
        Book book = bookMapper.toEntity(bookDTO);
        bookRepository.save(book);
        return bookDTO;
    }

    private boolean validBookDTO(BookDTO bookDTO) {
        if (Strings.isNullOrEmpty(bookDTO.getContent())) {
            throw new ManagementException();
        }
        return true;
    }

    @Override
    public Book updateBook(BookDTO bookDTO) {
        return null;
    }

    @Override
    public List<Book> findAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public void deleteBookById(Long id) {

    }

    @Override
    public BookDTO findById(Long id) {
        return null;
    }
}
