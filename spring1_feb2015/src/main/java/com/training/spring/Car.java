package com.training.spring;

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Starting Car");
	}

	@Override
	public void stop() {
		System.out.println("Stopping Car");
	}

	@Override
	public void drive() {
		System.out.println("Driving Car");
	}

}
