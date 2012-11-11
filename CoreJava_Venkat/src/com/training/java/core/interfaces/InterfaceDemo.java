package com.training.java.core.interfaces;

public class InterfaceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car = new RaceCar();
		
		car.start();
		car.accelerate(20);
		car.printInformation();
		car.stop();
	}

}
