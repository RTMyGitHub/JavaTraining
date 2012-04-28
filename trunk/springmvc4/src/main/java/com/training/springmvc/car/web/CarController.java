package com.training.springmvc.car.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(value="/cars/new", method=RequestMethod.GET)
	public ModelAndView createCarForm(Model model)
	{
		return new ModelAndView("AddCar", "car", new Car());
	}
	
	@RequestMapping(value="/cars/new", method=RequestMethod.POST)
	public String saveCar(@Valid Car car, BindingResult bindingResult)
	{
		if(bindingResult.hasErrors())
		{
			return "AddCar";
		}
		else
		{
			service.create(car);
			return "Acknowledgement";
		}
	}
}
