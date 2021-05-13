package com.example.springdocker.controller;

import com.example.springdocker.model.Book;
import com.example.springdocker.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BookController {
    private final BookService bookService;

    @GetMapping("/books")
    public List<Book> getBooks() { return bookService.getBooks();}

    @PostMapping("/books")
    public void saveNewFood(@RequestBody Book book) {
        bookService.saveNewBook(book);
    }

    @GetMapping("/books/fiction")
    public List<String> getFictionBooks() {
        return bookService.getFictionBooks();
    }
}
