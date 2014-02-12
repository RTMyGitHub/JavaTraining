package com.training.java.core.finalexample;

public class Truck implements Vehicle {
	
	private int currentSpeed;

	@Override
	public void start() {
		System.out.println("My truck is starting..");
		
	}

	@Override
	public int accelerate(int howMuch) {
		currentSpeed = currentSpeed + howMuch;
		
		return currentSpeed;
	}

	@Override
	public void stop() {
		System.out.println("My truck is stopping..");
	}

	@Override
	public int getCurrentSpeed() {
		return currentSpeed;
	}

}
