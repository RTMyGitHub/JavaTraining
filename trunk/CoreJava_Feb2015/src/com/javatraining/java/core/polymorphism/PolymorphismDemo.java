package com.javatraining.java.core.polymorphism;

public class PolymorphismDemo {

	public static void main(String[] args) {
		
		Animal a1 = new Pug();
		Animal a2 = new Dog();
		
		AnimalFeeder af = new AnimalFeeder();
		
		af.feed(a1);
		af.feed(a2);
		
		Pug p1 = new Pug();
		
		p1.eat();
		p1.run();
		p1.walk();
		

	}

}
