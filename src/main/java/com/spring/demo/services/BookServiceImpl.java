package com.spring.demo.services;

import com.spring.demo.dao.AuthorRepository;
import com.spring.demo.dao.BookRepository;
import com.spring.demo.dto.BookDTO;
import com.spring.demo.entities.Book;
import com.spring.demo.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookServices{

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    private final BookMapper bookMapper;

    public BookServiceImpl(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }


    @Override
    public BookDTO createBook(BookDTO bookDTO) {
/*        Book book = new Book();
        book.setBookName(bookDTO.getBookName());
        book.setContent(bookDTO.getContent());
        book.setDescription(bookDTO.getDescription());
        book.setTitle(bookDTO.getTitle());
        book.setAuthorName(bookDTO.getAuthorName());*/
        Book book = bookMapper.toEntity(bookDTO);
        bookRepository.save(book);
        return bookDTO;
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
