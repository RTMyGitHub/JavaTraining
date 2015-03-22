package com.javatraining.java.core.interfaces;

public class Animal implements Movable, Eatable {

	@Override
	public void move() {
		System.out.println("Animals move");
	}

	@Override
	public void eat() {
		
		System.out.println("Animals eat");
		
	}
}
