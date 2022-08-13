package com.example.library.util;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.library.model.Book;
import com.example.library.service.BookService;

@Component
public class DummyBookFilter {
    private final BookService bookService;

    public DummyBookFilter(BookService bookService) {
        this.bookService = bookService;
    }
    
    @PostConstruct
    public void init()
    {
        bookService.addBook(new Book(null, "El señor de los anillos", "Libro completo de la trilogia", "J.R.R Tolkien", 500, 2));
        try {Thread.sleep(100);} catch (InterruptedException e){}
        bookService.addBook(new Book(null, "El Hobbit", "Libro del Hobbit", "J. R. R. Tolkien", 450, 1));
        try {Thread.sleep(100);} catch (InterruptedException e){}
        bookService.addBook(new Book(null, "Harry potter y la piedra filosofal", "Libro de Harry Potter", "J.K Rowling", 600, 3));
    }
}
