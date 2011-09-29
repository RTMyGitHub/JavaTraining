package com.training.java.spring;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle
{

	public void accelerate()
	{
		System.out.println("Car is accelerating");
	}

	public void applyBrakes()
	{
		System.out.println("Car is applying brakes");
	}

	public void start()
	{
		System.out.println("Car is starting");
	}

	public void stop()
	{
		System.out.println("Car is stopping");
	}
}
