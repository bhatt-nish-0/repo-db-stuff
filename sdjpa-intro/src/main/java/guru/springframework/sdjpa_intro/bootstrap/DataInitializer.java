package guru.springframework.sdjpa_intro.bootstrap;


import guru.springframework.sdjpa_intro.domain.Book;
import guru.springframework.sdjpa_intro.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Book bookDDD = new Book("Domain Driven Design","123","RandomHouse");
        System.out.println("printing out id" + bookDDD.getId());
        Book saved = bookRepository.save(bookDDD);
        System.out.println("printing out id of saved DDD -->" + saved.getId());
        Book bookSIA = new Book("Spring In Action","234234","OReilley");
        System.out.println("printing out id" + bookSIA.getId());
        Book saved2 = bookRepository.save(bookSIA);
        System.out.println("pringint out id of saved SIA -->" + saved2.getId());

        Book another = new Book("another","786","Rola");
        bookRepository.save(another);

        System.out.println();
        System.out.println("printing out all books");
        bookRepository.findAll().stream().forEach(book -> {
            System.out.println(book.getId());
            System.out.println(book.getIsbn());
            System.out.println(book.getPublisher());
            System.out.println(book.getTitle());
            System.out.println();
        });



    }
}
