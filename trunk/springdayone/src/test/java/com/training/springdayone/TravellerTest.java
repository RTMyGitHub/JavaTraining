package com.training.springdayone;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TravellerTest
{
	@Test
	public void testTravel() throws Exception
	{
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		//Traveller traveller = (Traveller) context.getBean("traveller");
		
		Vehicle vehicle = new MockVehicle();
		Traveller traveller = new Traveller(vehicle);
		traveller.travel();
	}
}
