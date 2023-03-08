package com.example.demo.book;

import com.example.demo.author.Author;

public class BookCommand {

    private final String title;
    private final Author author;

    public BookCommand(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }
}
