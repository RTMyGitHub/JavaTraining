package com.training.jpa2.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config.xml")
public class BookServiceImplTest {

	@Autowired
	private BookService service;

	@Test
	public void testFindByPrimaryKey() throws Exception {
		Book book = service.findByPrimaryKey(11);

		System.out.println("Title = " + book.getTitle());
		System.out.println("ISBN = " + book.getIsbn());

		// You will get LazyInitializationException because the EntityManager is
		// already closed as the transaction got committed.
		System.out.println("Pub name = " + book.getPublisher().getName());
	}

}
