package com.training.springdayone;

public class Car implements Vehicle
{
	@Override
	public void start()
	{
		System.out.println("Car is starting");
	}
	
	@Override
	public void drive()
	{
		System.out.println("Car is driving");
	}
	
	@Override
	public void stop()
	{
		System.out.println("Car is stopping");
	}
}
