package com.training.java.core.abstraction;

public class Driver {
	
	private Car car;
	
	public Driver(Car car)
	{
		this.car = car;
	}
	
	public void drive()
	{
		car.start();
		car.accelerate(50);
		
		System.out.println("Current speed = " + car.getCurrentSpeed());
		
		car.stop();
	}

}
