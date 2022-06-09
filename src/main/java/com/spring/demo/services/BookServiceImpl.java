package com.spring.demo.services;

import com.spring.demo.dao.AuthorRepository;
import com.spring.demo.dao.BookRepository;
import com.spring.demo.dto.BookDTO;
import com.spring.demo.entities.Author;
import com.spring.demo.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookServices{

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;


    @Override
    public BookDTO createBook(BookDTO bookDTO) {
        Book book = new Book();
        book.setBookName(bookDTO.getBookName());
        book.setContent(bookDTO.getContent());
        book.setDescription(bookDTO.getDescription());
        book.setTitle(bookDTO.getTitle());
        Author author = new Author();
        author.setAuthorName(bookDTO.getAuthor().getAuthorName());
        author.setBirthDate(bookDTO.getAuthor().getBirthDate());
        author.setPhoneName(bookDTO.getAuthor().getPhoneName());
        author.setEmail(bookDTO.getAuthor().getEmail());
        book.setAuthor(author);
        List<Book> bookList = new ArrayList<>();
        bookList.add(book);
        author.setBookList(bookList);
        authorRepository.save(author);
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
