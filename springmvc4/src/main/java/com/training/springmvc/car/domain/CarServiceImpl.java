package com.training.springmvc.car.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService
{
	@Autowired
	private CarDAO dao;
	
	@Override
	public void create(Car car)
	{
		dao.createCar(car);
	}

	@Override
	public List<Car> getAllCars()
	{
		return dao.getAllCars();
	}
}
