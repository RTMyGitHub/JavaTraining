package com.javavenkat.training.java.core.inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		Dog dog = new Dog("Tommy", 5, 1.5, 4, "pitbul");
		
		dog.eat();
		dog.walk();
		dog.setColor("blue");
		
		Cow cow = new Cow("Cow", 1, 5.6, 4);
		
		cow.eat();
		cow.walk();
		cow.milk();
		cow.setColor("white");
	}

}
