package com.training.spring.two;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService
{
	private CarDAO dao;
	
	@Autowired
	public CarServiceImpl(@Qualifier("jdbc") CarDAO dao)
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
