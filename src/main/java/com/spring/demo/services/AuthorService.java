package com.spring.demo.services;

import com.spring.demo.dto.AuthorDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthorService {
    AuthorDTO createAuthor(AuthorDTO authorDTO);
    AuthorDTO updateAuthorById(AuthorDTO authorDTO, String id);
    List<AuthorDTO> findAllAuthor();
    void deleteAuthorById(String id);
    AuthorDTO findById(String id);
}
