package com.training.java.core.inheritence;

public class InheritenceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		PoliceCar policeCar = new PoliceCar("Red");
		
		policeCar.start();
		policeCar.accelerate(20);
		policeCar.applyBrakes(10);
		policeCar.turnOnLights();
		policeCar.chase();
		policeCar.printInformation();
		
	}

}
