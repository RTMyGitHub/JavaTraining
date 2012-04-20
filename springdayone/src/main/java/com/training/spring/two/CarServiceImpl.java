package com.training.spring.two;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService
{
	private CarDAO dao;
	
	public CarServiceImpl(CarDAO dao)
	{
		this.dao = dao;
	}

	@Override
	public void create(Car car)
	{
		dao.createCar(car);
	}

	@Override
	public List<Car> getAllCars()
	{
		List<Car> allCars = dao.getAllCars();

		List<Car> fordCars = new ArrayList<Car>();

		for (Car aCar : allCars)
		{
			if (aCar.getMake() != null
					&& aCar.getMake().equalsIgnoreCase("FORD"))
			{
				fordCars.add(aCar);
			}
		}

		return fordCars;
	}
}
