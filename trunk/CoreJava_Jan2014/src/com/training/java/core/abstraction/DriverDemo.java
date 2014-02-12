package com.training.java.core.abstraction;

public class DriverDemo {

	public static void main(String[] args) {
		
		Car raceCar = new RaceCar();
		
		Driver driver = new Driver(raceCar);
		driver.drive();
	}

}
