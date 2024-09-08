package guru.springframework.sdjpa_intro.controller;

import guru.springframework.sdjpa_intro.domain.Book;
import guru.springframework.sdjpa_intro.repositories.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("getAllBooks")
    public List<Book> getBooks() {
        System.out.println("hitting this api!");
        System.out.println("hitting this api!");
        System.out.println("hitting this api!");
        System.out.println("hitting this api!");
        System.out.println("hitting this api!");
        System.out.println("hitting this api!");
        return bookRepository.findAll();
    }
}
