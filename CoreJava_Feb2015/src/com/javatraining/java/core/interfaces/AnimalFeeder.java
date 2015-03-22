package com.javatraining.java.core.interfaces;

import java.util.List;

public class AnimalFeeder {
	
	public void feed(Eatable e)
	{
		e.eat();
	}
	
	public void feed(Animal a)
	{
		a.eat();
	}
	
	public void feed(Bird b)
	{
		b.fly();
		b.eat();
	}
	
	public void feed(List<Animal> animals)
	{
		for(Animal animal : animals)
		{
			animal.eat();
			animal.move();
		}
	}
}
