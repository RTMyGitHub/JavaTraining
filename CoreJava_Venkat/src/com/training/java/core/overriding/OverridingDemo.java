package com.training.java.core.overriding;

public class OverridingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car car = new PoliceCar("Blue");
		
		Driver kalpana = new Driver(car);
		kalpana.drive();
		
	}

}
