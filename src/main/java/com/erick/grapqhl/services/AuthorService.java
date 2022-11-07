package com.erick.grapqhl.services;

import com.erick.grapqhl.entities.Author;
import com.erick.grapqhl.repositories.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorService {

    private final AuthorRepository repository;

    public List<Author> findAll() {
        return repository.findAll();
    }

    public Author save(Author author) {
        return repository.save(author);
    }

    public Author findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Author findByName(String name) {
        return repository.findByName(name).orElseThrow();
    }

}
