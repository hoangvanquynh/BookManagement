package com.spring.demo.entities;

import com.spring.demo.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "author")
public class Author extends BaseEntity {
    @Id
    private String id;
    @Field("author_name")
    private String authorName;
    @Field("birth_date")
    private String birthDate;
    @Field("phone_name")
    private Double phoneName;
    @Field("email")
    private String email;
    @Field("books")
    private List<Book> books;

    public Author(String id, String authorName, String birthDate, Double phoneName, String email, List<Book> books) {
        this.authorName = authorName;
        this.birthDate = birthDate;
        this.phoneName = phoneName;
        this.email = email;
        this.books = books;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
