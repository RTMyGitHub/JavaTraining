package com.training.java.core.inheritence;

public class Car {
	
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
	
	public void accelerate(int increaseMiles)
	{
		currentSpeed += increaseMiles;
	}
	
	public void applyBrakes(int decreaseMiles)
	{
		currentSpeed -= decreaseMiles;
	}
	
	public void printInformation()
	{
		System.out.println("The color is " + color);
		System.out.println("The started flag is " + started);
		System.out.println("Current speed = " + currentSpeed);
	}


}
