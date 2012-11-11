package com.training.java.core.overriding;

public class RaceCar extends Car {
	
	public void nitro()
	{
		System.out.println("Nitro is on, I am zooming...");
	}
	
	@Override
	public void accelerate(int increaseMiles)
	{
		currentSpeed = currentSpeed + (4*increaseMiles);
	}
}
