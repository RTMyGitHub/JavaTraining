package com.training.servlet.car.domain;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class CarDAOJDBCImplTest {
	@Test
	public void testCreateCar() throws Exception {
		CarDAO dao = new CarDAOJDBCImpl();
		Car car = new Car(4,"Ford","Focus",2001,15000.00);
		dao.createCar(car);
		
		//Assert that car has been created
		
		Car carFromDB = dao.getCarById(4);
		assertNotNull(carFromDB);
		assertEquals(4,carFromDB.getId());
		
}
	@Test
	public void testGetAllMovies() throws Exception {
	
		CarDAO dao = new CarDAOJDBCImpl();
		List<Car> cars = dao.getAllCars();
		assertFalse(cars.isEmpty());
		
		for(Car car: cars){
			System.out.println("Id = " + car.getId());
			System.out.println("Make = " + car.getMake());
			System.out.println("Model = " + car.getModel());
			System.out.println("Year = " + car.getYear());
			System.out.println("Price = " + car.getPrice());
		}
	}

	@Test
	public void testUpdateCar() throws Exception {
		CarDAO dao = new CarDAOJDBCImpl();
		Car car = new Car(3,"Chevy","Tahoe",1998,19222.90);
		dao.update(car);
		
		Car carFromDB = dao.getCarById(3);
		assertNotNull(carFromDB);
		assertEquals("Chevy",carFromDB.getMake());
		assertEquals("Tahoe",carFromDB.getModel());
		assertEquals(1998,carFromDB.getYear());
		assertEquals(19222.90, carFromDB.getPrice(),0.001);
		
	}
	@Test 
	public void testDeleteCar() throws Exception {
		CarDAO dao = new CarDAOJDBCImpl();
		dao.delete(1);
		
		Car carFromDB = dao.getCarById(1);
		assertNull(carFromDB);
		
	}
}
