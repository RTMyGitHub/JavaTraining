package com.training.jpa2.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-config.xml")
public class PublisherServiceImplTest {

	@Autowired
	private PublisherService service;
	
	@Test
	public void testCreate() {
		Publisher publisher = new Publisher();
		
		publisher.setName("Oracle Press");
		publisher.setAddress("2 Oracle drive");
		publisher.setCity("MountainView");
		publisher.setZipCode("98765");
		
		service.create(publisher);
	}

}
