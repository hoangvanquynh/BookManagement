package com.spring.demo.controller;

import com.spring.demo.dto.BookDTO;
import com.spring.demo.services.BookServiceImpl;
import com.spring.demo.services.BookServices;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
public class BookControllerTest {
    @Mock
    BookServiceImpl bookServices;

    MockMvc restBookMockMvc;

    @InjectMocks
    BookController bookController;

    @Before
    public void setup() {
        this.restBookMockMvc = MockMvcBuilders.standaloneSetup(bookController).build();
    }

    @Test
    public void testCreateBook_success() throws Exception {
        BookDTO dto = new BookDTO();
        dto.setBookName("Book name");
        dto.setAuthorName("Author name");
        dto.setTitle("Title");
        dto.setDescription("Description");
        dto.setContent("Content");
        when(bookServices.createBook(any())).thenReturn(dto);
        restBookMockMvc.perform(MockMvcRequestBuilders.post("/createBook"))
                .andExpect(status().isOk()).andReturn();
    }
}
