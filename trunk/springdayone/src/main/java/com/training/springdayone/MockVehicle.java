package com.training.springdayone;

public class MockVehicle implements Vehicle
{
	@Override
	public void start()
	{
		System.out.println("Dummy start");
	}

	@Override
	public void drive()
	{
		System.out.println("Dummy drive");
	}

	@Override
	public void stop()
	{
		System.out.println("Dummy stop");
	}
}
