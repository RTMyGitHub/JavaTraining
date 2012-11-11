package com.training.java.core.interfaces;

public class RaceCar implements Car {
	
	private int currentSpeed;
	
	@Override
	public void start() {
		System.out.println("RaceCar starting");
	}

	@Override
	public void stop() {
		System.out.println("RaceCar stopping");
	}

	@Override
	public void accelerate(int increaseMiles) {
		currentSpeed = currentSpeed + (4*increaseMiles);
	}

	@Override
	public void printInformation() {
		new ConsolePrinter().print("Current speed = " + currentSpeed);
	}
	
}
