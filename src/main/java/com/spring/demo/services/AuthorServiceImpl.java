package com.spring.demo.services;

import com.spring.demo.dao.AuthorRepository;
import com.spring.demo.dto.AuthorDTO;
import com.spring.demo.entities.Book;
import com.spring.demo.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AuthorServiceImpl implements AuthorService{
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public AuthorDTO createAuthor(AuthorDTO authorDTO) {
        return null;
    }

    @Override
    public AuthorDTO updateAuthorById(AuthorDTO authorDTO, String id) {
        return null;
    }

    @Override
    public List<AuthorDTO> findAllAuthor() {
        return null;
    }

    @Override
    public void deleteAuthorById(String id) {

    }

    @Override
    public AuthorDTO findById(String id) {
        return null;
    }
}
