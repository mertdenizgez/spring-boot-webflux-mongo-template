package com.mertdenizgez.template.controllers;

import com.mertdenizgez.template.models.Book;
import com.mertdenizgez.template.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController()
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping()
    public Flux<Book> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping()
    public Mono<Book> addBook(Book book) {
        return bookService.addBook();
    }
}
