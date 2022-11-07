package com.erick.grapqhl.controllers;

import com.erick.grapqhl.entities.Author;
import com.erick.grapqhl.services.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class AuthorController {

    private final AuthorService service;

    @QueryMapping(name = "authors")
    public List<Author> findAll() {
        return service.findAll();
    }

    @QueryMapping(name = "authorById")
    public Author findById(@Argument Long id) {
        return service.findById(id);
    }

}
