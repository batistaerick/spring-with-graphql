package com.erick.grapqhl.controllers;

import com.erick.grapqhl.entities.Author;
import com.erick.grapqhl.entities.Book;
import com.erick.grapqhl.services.AuthorService;
import com.erick.grapqhl.services.BookService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class BookController {

    private final BookService service;
    private final AuthorService authorService;

    @MutationMapping(name = "addBook")
    public Book save(@Argument BookInput bookInput) {
        Author author = authorService.findByName(bookInput.authorName());
        return service.save(new Book(null, bookInput.title(), bookInput.publisher(), author));
    }

    record BookInput(String title, String publisher, String authorName) {
    }

}
