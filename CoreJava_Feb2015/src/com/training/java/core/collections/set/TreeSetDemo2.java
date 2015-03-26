package com.training.java.core.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		
		Set<Student> students = new TreeSet<Student>();
		
		Student student1 = new Student(5, "Aruna", "D.C", "MD", "12345");
		Student student2 = new Student(1, "Yuri", "Novi", "MI", "54321");
		Student student3 = new Student(4, "Jyothy", "Rochester", "MI", "56789");
		Student student4 = new Student(3, "Kal", "Troy", "MI", "98765");
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		
		StudentPrinter printer = new StudentPrinter();
		printer.print(students);


	}

}
