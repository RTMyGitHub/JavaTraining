package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Traveller2 {

	@Autowired
	@Qualifier("bus")
	private Vehicle vehicle;
	
	private String name;

	public void travel() {
		name = "Anteneh";

		System.out.println(name + " is travelling");
		vehicle.start();
		vehicle.drive();
		vehicle.stop();
	}

	public String getName() {
		return name;
	}
}
