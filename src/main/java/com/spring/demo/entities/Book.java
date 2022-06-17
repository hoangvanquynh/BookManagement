package com.spring.demo.entities;

import com.spring.demo.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotBlank;

@Document(collection = "book")
public class Book extends BaseEntity {

    @Id
    private String id;
    @Field("title")
    private String title;
    @Field("price")
    private Double price;
    @Field("content")
    private String content;
    @Field("book_name")
    private String bookName;
    @Field("description")
    private String description;

    private String authorName;

    public Book(String id, String title, Double price, String content, String bookName, String authorName, String description) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.content = content;
        this.bookName = bookName;
        this.authorName = authorName;
        this.description = description;
    }

    public Book() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
