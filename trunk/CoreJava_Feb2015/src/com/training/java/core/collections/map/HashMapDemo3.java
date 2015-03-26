package com.training.java.core.collections.map;

import java.util.HashMap;
import java.util.Map;

import com.training.java.core.collections.set.Student;

public class HashMapDemo3 {

	public static void main(String[] args) {
		
		Student student1 = new Student(5, "Aruna", "D.C", "MD", "12345");
		Student student2 = new Student(1, "Yuri", "Novi", "MI", "54321");
		Student student3 = new Student(4, "Jyothy", "Rochester", "MI", "56789");
		Student student4 = new Student(3, "Kal", "Troy", "MI", "98765");
		
		Map<Integer, Student> students = new HashMap<Integer, Student>();
		
		students.put(5, student1);
		students.put(1, student2);
		students.put(4, student3);
		students.put(3, student4);
		
		Student s = students.get(4);

		System.out.println(s);
	}

}
