package com.spring.demo.service;

import com.spring.demo.dao.BookRepository;
import com.spring.demo.dto.BookDTO;
import com.spring.demo.entities.Book;
import com.spring.demo.exception.ManagementException;
import com.spring.demo.mapper.BookMapper;
import com.spring.demo.services.BookServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceTest {

    @Mock
    BookMapper bookMapper;

    @Mock
    BookRepository bookRepository;

    @InjectMocks
    BookServiceImpl bookServices;

    @Test
    public void whenCreateBook_thenSuccess() {
        Book book = buildDateBook();
        BookDTO bookDTO = buildDateBookDTO();
        when(bookMapper.toEntity(any(BookDTO.class))).thenReturn(book);
        when(bookRepository.save(any(Book.class))).thenReturn(book);
        BookDTO result = bookServices.createBook(bookDTO);
        Assert.assertEquals(result.getBookName(), "Book name");

    }
    @Test(expected = ManagementException.class)
    public void whenCreateBook_thenThrowException() {
        Book book = buildDateBook();
        BookDTO bookDTO = new BookDTO("Title", "", "","", "");
        when(bookMapper.toEntity(any(BookDTO.class))).thenReturn(book);
        when(bookRepository.save(any(Book.class))).thenReturn(book);
        bookServices.createBook(bookDTO);

    }

    private Book buildDateBook() {
        Book book = new Book();
        book.setId("1");
        book.setBookName("Book name");
        book.setAuthorName("Author name");
        book.setTitle("Title");
        book.setDescription("Description");
        book.setContent("Content");
        return book;
    }

    private BookDTO buildDateBookDTO() {
        BookDTO dto = new BookDTO();
        dto.setBookName("Book name");
        dto.setAuthorName("Author name");
        dto.setTitle("Title");
        dto.setDescription("Description");
        dto.setContent("Content");
        return dto;
    }
}
