package com.example.demo.book;

import com.example.demo.author.Author;

public class Book {

    private final String title;
    private final Author author;
    private Long id;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }
}
