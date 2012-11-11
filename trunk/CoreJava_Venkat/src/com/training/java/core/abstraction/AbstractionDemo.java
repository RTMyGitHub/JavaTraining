package com.training.java.core.abstraction;

public class AbstractionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		Car car = new ItalianRaceCar();
		
		car.start();
		car.accelerate(20);
		car.printInformation();
	}

}
