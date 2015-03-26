package com.training.java.core.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {
		Set<Student> students = new HashSet<Student>();
		
		Student student1 = new Student(1, "Yuri", "D.C", "MD", "12345");
		Student student2 = new Student(2, "Venkat", "Novi", "MI", "54321");
		Student student3 = new Student(3, "Uma", "Rochester", "MI", "56789");
		Student student4 = new Student(1, "Venkat", "Troy", "MI", "98765");
		
		System.out.println("Hashcode1 = " + student1.hashCode());
		System.out.println("Hashcode2 = " + student2.hashCode());
		System.out.println("Hashcode3 = " + student3.hashCode());
		System.out.println("Hashcode4 = " + student4.hashCode());
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		
		StudentPrinter printer = new StudentPrinter();
		printer.print(students);
	}

}
