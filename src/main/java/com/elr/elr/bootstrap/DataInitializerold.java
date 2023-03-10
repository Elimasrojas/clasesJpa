package com.elr.elr.bootstrap;



import com.elr.elr.domain.Book;
import com.elr.elr.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 6/12/21.
 */
@Component
public class DataInitializerold implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataInitializerold(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Book bookDDD = new Book("Domain Driven Design", "123", "RandomHouse");

        System.out.println("Id: " + bookDDD.getId() );

        Book savedDDD = bookRepository.save(bookDDD);

        System.out.println("Id: " + savedDDD.getId() );

        Book bookSIA = new Book("Spring In Action", "234234", "Oriely");
        Book savedSIA = bookRepository.save(bookSIA);

        bookRepository.findAll().forEach(book -> {
            System.out.println("Book Id: " + book.getId());
            System.out.println("Book Title: " + book.getTitle());
        });

    }
}