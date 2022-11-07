package com.erick.grapqhl.repositories;

import com.erick.grapqhl.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
