package com.training.spring;

import org.springframework.stereotype.Component;

@Component
public class Traveller2 {

	private Vehicle vehicle;
	private String name;

	public void travel() {
		System.out.println(name + " is travelling");
		vehicle.start();
		vehicle.drive();
		vehicle.stop();
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
