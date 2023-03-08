package com.example.demo.book;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BookStorage {

    private final Map<Long, Book> books;
    private Long counter = 0L;

    public BookStorage() {
        this.books = new HashMap<>();
    }

    public List<Book> findAll() {
        return new ArrayList<>(books.values());
    }

    public Long save(Book book) {
        books.put(++counter, book);
        return counter;
    }

    public Book delete(Long bookId) {
        Book book = books.get(bookId);
        books.remove(bookId);
        return book;
    }
}
