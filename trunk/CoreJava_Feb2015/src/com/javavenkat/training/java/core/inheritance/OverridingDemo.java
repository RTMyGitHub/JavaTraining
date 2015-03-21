package com.javavenkat.training.java.core.inheritance;

public class OverridingDemo {

	public static void main(String[] args) {
		
		//Animal a = new Dog("Tommy", 5, 1.5, 4, "pitbul");
		Animal a = new Cat("Tommy", 5, 1.5, 4);
		
		a.walk();
		a.eat();
		a.getAge();
		a.getName();
		
		AnimalPrinter printer = new AnimalPrinter();
		printer.print(a);

	}
	

}
