package com.javatraining.java.core.interfaces;

public class Bird extends Animal implements Flyable {
	
	@Override
	public void fly() {
		System.out.println("Bird is flying");
	}

}
