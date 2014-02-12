package com.training.java.core.immutability;

public class ImmutabilityDemo {

	public static void main(String[] args) {

		Car focus = new Car("Ford", "Focus", 2014);
		Car accord = new Car("Honda", "Accord", 2014);
		Car volt = new Car("Chevy", "Volt", 2014);
		Car camry = new Car("Toyota", "Camry", 2014);

		focus.getMake();
		focus.getModel();
		focus.getYear();

	}

}
