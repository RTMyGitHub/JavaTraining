package com.training.jpa2.domain;

import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-config.xml")
public class BookDAOJPAImplTest {
	
	@Autowired
	private BookDAO dao;

	@Ignore
	public void testCreate() throws Exception {

		Book book = new Book();
		book.setAuthor("Cathy Sierra");
		book.setTitle("Head First Java");
		book.setIsbn("987654");
		book.setPages(321);
		book.setPublisherDate(new Date());

		// If Cascade persist or Cascade ALL if ON, if this publisher doesn't
		// exist, it will create a new publisher first and then inserts its key in book table
		Publisher publisher = new Publisher();

		publisher.setName("Orielly");
		publisher.setAddress("1234 Main St");
		publisher.setCity("Troy");
		publisher.setZipCode("48084");

		book.setPublisher(publisher);

		dao.create(book);
	}

	@Ignore
	public void testFindByPrimaryKey() throws Exception {

		Book book = dao.findByPrimaryKey(7);

		System.out.println("book = " + book);
		System.out.println("Publisher = " + book.getPublisher());
	}

	@Test
	public void testUpdate() throws Exception {

		Book book = dao.findByPrimaryKey(7);

		book.setAuthor("Cathy Sierra & Bert Bates");

		dao.update(book);
	}

	@Ignore
	public void testDelete() throws Exception {
		dao.delete(4);
	}

}
