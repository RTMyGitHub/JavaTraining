package com.training.struts.car.domain;

import java.util.List;

public interface CarService
{
	void create(Car car);
	List<Car> getAllCars();
}
