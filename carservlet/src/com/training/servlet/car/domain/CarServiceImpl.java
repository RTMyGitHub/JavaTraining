package com.training.servlet.car.domain;

import java.util.List;

public class CarServiceImpl implements CarService
{
	@Override
	public void create(Car car)
	{
		CarDAO dao = new CarDAOJDBCImpl();
		dao.createCar(car);
	}

	@Override
	public List<Car> getAllCars()
	{
		CarDAO dao = new CarDAOJDBCImpl();
		return dao.getAllCars();
	}
}
