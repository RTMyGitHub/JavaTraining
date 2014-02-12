package com.training.java.core.finalexample;

public class Bus implements Vehicle {
	
	private int currentSpeed;

	@Override
	public void start() {
		
		System.out.println("Bus is starting");

	}

	@Override
	public int accelerate(int howMuch) {
		currentSpeed += howMuch;
		
		return currentSpeed;
	}

	@Override
	public void stop() {
		System.out.println("Bus is stopping");
	}

	@Override
	public int getCurrentSpeed() {
		return currentSpeed;
	}

}
