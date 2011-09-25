package com.training.java.spring;

public class Boat implements Vehicle
{

	public void accelerate()
	{
		System.out.println("Boat is accelerating");
	}

	public void applyBrakes()
	{
		System.out.println("Boat is applying brakes");
	}

	public void start()
	{
		System.out.println("Boat is starting");
	}

	public void stop()
	{
		System.out.println("Boat is stopping");
	}
}
