package com.example.demo.book;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookStorage bookStorage;

    public BookService(BookStorage bookStorage) {
        this.bookStorage = bookStorage;
    }

    public List<Book> getBooks() {
        return bookStorage.findAll();
    }

    public Long createBook(BookCommand command) {
        return bookStorage.save(new Book(command.getTitle(), command.getAuthor()));
    }

    public Long updateBook(Long bookId, BookCommand command) {
        return bookStorage.save(new Book(command.getTitle(), command.getAuthor()));
    }

    public Book deleteBook(Long bookId) {
        return bookStorage.delete(bookId);
    }
}
