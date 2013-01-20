package com.training.jpa2.domain;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-config.xml")
public class PublisherDAOJPAImplTest {

	@Autowired
	private PublisherDAO dao;
	
	@Test
	public void testFindByName() {
		Publisher publisher = dao.findByName("Orielly");

		System.out.println("Publisher = " + publisher);
		System.out.println("Books = " + publisher.getBooks());
	}

	@Ignore
	public void testCreate() {
		
		Publisher publisher = new Publisher();
		
		publisher.setName("Apple Press");
		publisher.setAddress("One Infinite Loop");
		publisher.setCity("Cupertino");
		publisher.setZipCode("12345");
		
		dao.create(publisher);
	}

}
