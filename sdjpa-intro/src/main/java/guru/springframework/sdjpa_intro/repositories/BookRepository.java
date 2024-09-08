package guru.springframework.sdjpa_intro.repositories;

import guru.springframework.sdjpa_intro.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository - no need
public interface BookRepository extends JpaRepository<Book,Long> {
}
