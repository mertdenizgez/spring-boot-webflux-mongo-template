package com.mertdenizgez.template.service;

import com.mertdenizgez.template.models.Book;
import com.mertdenizgez.template.repository.BookRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Flux<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Mono<Book> addBook() {
        var book = new Book("SSN", "Lotr", "Tolkien");
        return bookRepository.save(book);
    }

}
