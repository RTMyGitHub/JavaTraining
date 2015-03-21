package com.javatraining.java.core.polymorphism;

public class Dog extends Animal {
	
	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}
	
	@Override
	public void run() {
		System.out.println("Dog hussles differently");
	}

}
