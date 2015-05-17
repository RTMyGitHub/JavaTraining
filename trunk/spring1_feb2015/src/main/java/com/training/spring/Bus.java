package com.training.spring;

public class Bus implements Vehicle {

	@Override
	public void start() {
		System.out.println("Starting Bus");
	}

	@Override
	public void stop() {
		System.out.println("Stopping Bus");
	}

	@Override
	public void drive() {
		System.out.println("Driving Bus");
	}

}
