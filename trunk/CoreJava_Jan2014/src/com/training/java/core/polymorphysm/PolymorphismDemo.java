package com.training.java.core.polymorphysm;

public class PolymorphismDemo {

	public static void main(String[] args) {

		PoliceCar policeCar = new PoliceCar();
		RaceCar raceCar = new RaceCar();

		execute(policeCar);
		execute(raceCar);

	}

	public static void execute(Car car) {
		car.start();
		car.accelerate(30);

		System.out.println("Current speed = " + car.getCurrentSpeed());
	}

}
