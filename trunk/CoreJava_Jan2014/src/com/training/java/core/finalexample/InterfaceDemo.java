package com.training.java.core.finalexample;

public class InterfaceDemo {

	public static void main(String[] args) {
		
		Vehicle v = new Truck();
		
		Driver driver = new Driver(v);
		driver.drive();

	}

}
