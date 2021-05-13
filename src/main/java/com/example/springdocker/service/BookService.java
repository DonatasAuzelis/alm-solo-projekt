package com.example.springdocker.service;

import com.example.springdocker.model.Book;
import com.example.springdocker.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public void saveNewBook(Book book) {
        bookRepository.save(book);
    }

    public List<String> getFictionBooks() {
        List<Book> fictionBooks = bookRepository.findBookByIsFiction(true);

        return fictionBooks.stream()
                .map(Book::getTitle)
                .collect(Collectors.toList());
    }
}
