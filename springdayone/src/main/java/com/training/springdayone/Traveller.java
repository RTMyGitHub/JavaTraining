package com.training.springdayone;

public class Traveller
{
	private Vehicle vehicle;
	
	public Traveller(Vehicle vehicle)
	{
		this.vehicle = vehicle;
	}
	
	public void travel()
	{
		vehicle.start();
		vehicle.drive();
		vehicle.stop();
	}

}
