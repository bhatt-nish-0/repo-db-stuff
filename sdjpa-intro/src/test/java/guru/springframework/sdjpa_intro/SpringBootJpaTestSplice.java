package guru.springframework.sdjpa_intro;

import guru.springframework.sdjpa_intro.domain.Book;
import guru.springframework.sdjpa_intro.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class SpringBootJpaTestSplice {

    @Autowired
    BookRepository bookRepository;

    @Test
    void testJpaTestSplice() {
        long count = bookRepository.count();

        bookRepository.save(new Book("My book","1234444","self"));

        long countAfter = bookRepository.count();

        assertThat(count).isEqualTo(0);
        assertThat(countAfter).isEqualTo(1);
    }
}
