package com.training.java.core.collections.set;

import java.util.Set;

public class StudentPrinter {
	
	public void print(Set<Student> students)
	{
		for(Student student : students)
		{
			System.out.println("Student id " + student.getId() + " name " + student.getName());
		}
	}
}
