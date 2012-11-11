package com.training.java.core.inheritence;

public final class PoliceCar extends Car {
	
	public PoliceCar(String color)
	{
		super.color = color;
	}
	
	public void chase()
	{
		System.out.println("Police car is chasing..");
	}
	
	public void turnOnLights()
	{
		super.start();
		System.out.println("Turned on LED lights");
		super.stop();
	}
}
