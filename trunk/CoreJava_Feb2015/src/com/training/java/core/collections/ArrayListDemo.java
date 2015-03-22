package com.training.java.core.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Anoop");
		names.add("Aruna");
		names.add("Deshikan");
		names.add("Jyothy");
		names.add("Anoop");
		
		for(String name : names)
		{
			System.out.println(name);
		}
		
		System.out.println("**************");
		names.remove(3);
		
		String studentAtPosition3 = names.get(3);
		System.out.println("Student at position 3 = " + studentAtPosition3);
		
		Iterator<String> ite = names.iterator();
		
		while(ite.hasNext())
		{
			String name = ite.next();
			System.out.println(name);
		}
		
		
	}

}
