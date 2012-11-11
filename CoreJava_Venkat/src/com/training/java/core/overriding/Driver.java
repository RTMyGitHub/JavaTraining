package com.training.java.core.overriding;

public class Driver {
	
	private Car car;
	
	public Driver(Car car)
	{
		this.car = car;
	}
	
	public void drive()
	{
		car.start();
		car.accelerate(20);
		
		System.out.println("Current speed = " + car.getCurrentSpeed());
	}

}
