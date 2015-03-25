package com.training.java.core.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class StudentPrinter {
	
	public void print(List<String> students)
	{
		for(String student : students)
		{
			System.out.println("Name = " + student);
		}
	}

}
