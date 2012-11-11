package com.suneetha;

public class Car {
	
	//instance variables
	String color = "red";
	String vinNumber;
	int age;
	boolean isRaceCar;
	
	void start()
	{
		color = "blue";
		
		//method level variables or local variables
		String model = "Focus";
		
		
		
		System.out.println("Car started");
		System.out.println("And the color = " + color);
	}
	
	

}
