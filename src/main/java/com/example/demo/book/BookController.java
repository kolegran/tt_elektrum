package com.example.demo.book;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks() {
        return ResponseEntity.ok(bookService.getBooks());
    }

    @PostMapping("/books")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Long> createBook(@RequestBody BookCommand command) {
        return ResponseEntity.ok(bookService.createBook(command));
    }

    @PutMapping("/books/{bookId}")
    public ResponseEntity<Long> updateBook(@PathVariable("bookId") Long bookId, @RequestBody BookCommand command) {
        return ResponseEntity.ok(bookService.updateBook(bookId, command));
    }

    @DeleteMapping("/books/{bookId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Book> deleteBook(@PathVariable("bookId") Long bookId) {
        return ResponseEntity.ofNullable(bookService.deleteBook(bookId));
    }
}
