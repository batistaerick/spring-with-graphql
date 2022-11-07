package com.erick.grapqhl.services;

import com.erick.grapqhl.entities.Book;
import com.erick.grapqhl.repositories.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository repository;

    public List<Book> findAll() {
        return repository.findAll();
    }

    public Book save(Book book) {
        return repository.save(book);
    }

    public List<Book> saveAll(List<Book> books) {
        return repository.saveAll(books);
    }

}
