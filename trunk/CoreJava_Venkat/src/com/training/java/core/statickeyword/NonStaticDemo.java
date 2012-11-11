package com.training.java.core.statickeyword;

/**
 * 
 * 
 * @author Hari
 *
 */
public class NonStaticDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car focus = new Car("Ford", "Focus");
		Car twoHundred = new Car("Chrysler", "200");
		Car malibu = new Car("Chevy", "Malibu");
		Car accord = new Car("Honda", "Accord");
		
		System.out.println("No of cars created.." + Car.getNumberOfCarsCreated());
		
	}

}

