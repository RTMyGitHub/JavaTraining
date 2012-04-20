package com.training.spring.two;

import static junit.framework.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarServiceImplTest
{
	@Test
	public void testGetAllCars() throws Exception
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		CarService service = context.getBean(CarService.class);
		
		List<Car> cars = service.getAllCars();
		assertEquals(11, cars.size());
		
		for(Car aCar : cars)
		{
			System.out.println("Make = " + aCar.getMake());
			System.out.println("Model = " + aCar.getModel());
			System.out.println("Price = " + aCar.getPrice());
		}
	}
}
