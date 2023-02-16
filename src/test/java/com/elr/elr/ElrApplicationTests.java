package com.elr.elr;

import com.elr.elr.repositories.BookRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class ElrApplicationTests {

	@Autowired
	BookRepository bookRepository;


	@Test
	void tetsBookRepository() {
		long count =bookRepository.count();

		assertThat(count).isGreaterThan(0);
	}

	@Test
	void contextLoads() {
		//Assertions.fail("Oppp ja ja ...");
	}

}
