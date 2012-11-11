package com.training.java.core.abstraction;

public abstract class Car {
	
	int currentSpeed;
	boolean started;
	String color;
	

	protected void start()
	{
		System.out.println("Car is starting");
		started = true;
	}
	
	protected void stop()
	{
		System.out.println("Car is stopping");
		started = false;
	}
	
	public abstract void accelerate(int increaseMiles);
	
	public void applyBrakes(int decreaseMiles)
	{
		currentSpeed -= decreaseMiles;
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void printInformation()
	{
		System.out.println("The color is " + color);
		System.out.println("The started flag is " + started);
		System.out.println("Current speed = " + currentSpeed);
	}


}
