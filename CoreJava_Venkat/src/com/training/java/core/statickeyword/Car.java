package com.training.java.core.statickeyword;

public class Car {

	private String make;
	private String model;
	private int currentSpeed;
	
	private static int numberOfCarsCreated;
	
	public Car(String make, String model) {
		super();
		this.make = make;
		this.model = model;
		
		currentSpeed++;
		numberOfCarsCreated++;
		
		System.out.println("Current speed = " + currentSpeed);
		System.out.println("number of cars created = " + numberOfCarsCreated);
	}

	String getMake() {
		return make;
	}

	String getModel() {
		return model;
	}
	
	static int getNumberOfCarsCreated()
	{
		return numberOfCarsCreated;
	}
}
