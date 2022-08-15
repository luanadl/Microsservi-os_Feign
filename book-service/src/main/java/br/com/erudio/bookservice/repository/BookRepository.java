package br.com.erudio.bookservice.repository;

import br.com.erudio.bookservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
