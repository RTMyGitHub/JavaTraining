package com.training.java.core.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<String> students = new TreeSet<String>();
		
		students.add("Yuri");
		students.add("Anteneh");
		students.add("Sailaja");
		students.add("Aruna");
		
		for(String student : students)
		{
			System.out.println("Name = " + student);
		}
		
	}	

}
