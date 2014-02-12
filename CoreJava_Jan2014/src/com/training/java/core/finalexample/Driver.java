package com.training.java.core.finalexample;

public class Driver {
	
	private Vehicle vehicle;
	
	public Driver(Vehicle car)
	{
		this.vehicle = car;
	}
	
	public void drive()
	{
		vehicle.start();
		vehicle.accelerate(50);
		
		System.out.println("Current speed = " + vehicle.getCurrentSpeed());
		
		vehicle.stop();
	}

}
