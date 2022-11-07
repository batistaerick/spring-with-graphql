package com.erick.grapqhl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GrapqhlApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrapqhlApplication.class, args);
    }

//    @Bean
//    ApplicationRunner applicationRunner(AuthorService authorService, BookService bookService) {
//        return args -> {
//            Author erick = authorService.save(new Author(null, "Erick", null));
//            Author batista = authorService.save(new Author(null, "Batista", null));
//
//            bookService.saveAll(List.of(
//                    new Book(null, "Reactive Spring", "PublisherEUA", erick),
//                    new Book(null, "Cloud Native Java", "PublisherBrazil", batista),
//                    new Book(null, "Spring Graphql", "PublisherCanada", erick)
//            ));
//        };
//    }

}
