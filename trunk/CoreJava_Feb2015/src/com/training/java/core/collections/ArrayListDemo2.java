package com.training.java.core.collections;

import java.util.ArrayList;
import java.util.List;

import com.javatraining.java.core.interfaces.Animal;
import com.javatraining.java.core.interfaces.AnimalFeeder;
import com.javatraining.java.core.interfaces.Bird;
import com.javatraining.java.core.interfaces.Dog;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		List<Animal> animals = new ArrayList<Animal>();
		
		Animal a1 = new Dog();
		Animal a2 = new Bird();
		
		animals.add(a1);
		animals.add(a2);
		
		AnimalFeeder af = new AnimalFeeder();
		af.feed(animals);
		
	}

}
