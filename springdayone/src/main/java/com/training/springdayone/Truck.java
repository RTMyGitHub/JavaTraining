package com.training.springdayone;

public class Truck implements Vehicle
{

	@Override
	public void start()
	{
		System.out.println("Truck is starting"); 
	}

	@Override
	public void drive()
	{
		System.out.println("Truck is driving");
	}

	@Override
	public void stop()
	{
		System.out.println("Truck is stopping");
	}
}
