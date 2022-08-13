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
        bookService.addBook(new Book(null, "Cien años de soledad", "Libro de Realismo Magico", "Gabriel Garcia Marquez", 300, 2));
        try {Thread.sleep(100);} catch (InterruptedException e){}
        bookService.addBook(new Book(null, "Don Quijote de la mancha", "Libro de Ficcion", "Miguel de Cervantes", 250, 1));
        try {Thread.sleep(100);} catch (InterruptedException e){}
        bookService.addBook(new Book(null, "El principito", "Libro de Literatura Infantil", "Antoine de Saint", 150, 3));
        try {Thread.sleep(100);} catch (InterruptedException e){}
        bookService.addBook(new Book(null, "La Odisea", "Libro de Epopeya", "Homero", 100, 2));
        try {Thread.sleep(100);} catch (InterruptedException e){}
        bookService.addBook(new Book(null, "Los Juegos del Hambre", "Libro de Ciencia Ficcion", "Suzanne Collins", 50, 1));
        try {Thread.sleep(100);} catch (InterruptedException e){}
        bookService.addBook(new Book(null, "En llamas", "Libro de Thriller", "Suzanne Collins", 150, 3));
    }
}
