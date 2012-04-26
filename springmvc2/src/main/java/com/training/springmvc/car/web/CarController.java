package com.training.springmvc.car.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.training.springmvc.car.domain.Car;
import com.training.springmvc.car.domain.CarService;

@Controller
public class CarController
{
	@Autowired
	private CarService service;
	
	@RequestMapping("/cars")
	public ModelAndView getCars()
	{
		List<Car> cars = service.getAllCars();
		
		ModelAndView mvc = new ModelAndView();
		
		mvc.addObject("cars", cars);
		mvc.setViewName("ListCars");
		
		return mvc;
	}
}
