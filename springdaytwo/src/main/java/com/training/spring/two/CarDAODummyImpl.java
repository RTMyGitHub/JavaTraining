package com.training.spring.two;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("dummy")
public class CarDAODummyImpl implements CarDAO
{

	@Override
	public void createCar(Car car)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public List<Car> getAllCars()
	{
		List<Car> cars = new ArrayList<Car>();
		
		Car car1 = new Car("Sedan", "Ford", "Tarus", 2012, 12000.00);
		Car car2 = new Car("Sedan", "Toyota", "Corolla", 2011, 13000.00);
		
		cars.add(car1);
		cars.add(car2);
		
		return cars;
	}

	@Override
	public Car getCarById(int id)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Car car)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id)
	{
		// TODO Auto-generated method stub

	}

}
