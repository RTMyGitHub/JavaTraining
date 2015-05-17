package com.training.spring;

public class Truck implements Vehicle {

	@Override
	public void start() {
		System.out.println("Starting Truck");
	}

	@Override
	public void stop() {
		System.out.println("Stopping Truck");
	}

	@Override
	public void drive() {
		System.out.println("Driving Truck");
	}

}
