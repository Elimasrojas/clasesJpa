package com.elr.elr.repositories;



import com.elr.elr.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jt on 6/12/21.
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}