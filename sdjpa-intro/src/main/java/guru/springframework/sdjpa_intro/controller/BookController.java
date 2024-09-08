package guru.springframework.sdjpa_intro.controller;

import guru.springframework.sdjpa_intro.domain.Book;
import guru.springframework.sdjpa_intro.repositories.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("save")
    public void save(@RequestBody BookDto bookDto) {
        System.out.println("kachre jaise paisa");
        Book book = new Book(bookDto.getTitle(),bookDto.getIsbn(),bookDto.getPublisher());
        bookRepository.save(book);
    }
}

class BookDto {
    private String title;
    private String isbn;
    private String publisher;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
