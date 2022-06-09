package com.spring.demo.entities;

import com.spring.demo.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "author")
public class Author extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authorId;
    private String authorName;
    private String birthDate;
    private Double phoneName;
    private String email;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "author")
    private List<Book> bookList;

    public Author(Long authorId, String authorName, String birthDate, Double phoneName, String email, List<Book> bookList) {
        this.authorName = authorName;
        this.birthDate = birthDate;
        this.phoneName = phoneName;
        this.email = email;
        this.bookList = bookList;
        this.authorId = authorId;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Author() {
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Double getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(Double phoneName) {
        this.phoneName = phoneName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
