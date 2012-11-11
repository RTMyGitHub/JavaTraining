package com.training.java.core.interfaces;


public class PoliceCar implements Car {
	
	private int currentSpeed;

	@Override
	public void start() {
		System.out.println("PoliceCar starting");
	}

	@Override
	public void stop() {
		System.out.println("PoliceCar stopping");
	}

	@Override
	public void accelerate(int increaseMiles) {
		currentSpeed = currentSpeed + (2*increaseMiles);
	}

	@Override
	public void printInformation() {
		new ConsolePrinter().print("Current speed = " + currentSpeed);
	}
	
}
