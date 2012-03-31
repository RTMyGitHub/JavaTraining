package com.training.servlet.car.domain;

import java.util.List;


interface CarDAO {
	void createCar(Car car);
	List<Car> getAllCars();
	Car getCarById(int id);
	void update(Car car);
	void delete(int id);
}
