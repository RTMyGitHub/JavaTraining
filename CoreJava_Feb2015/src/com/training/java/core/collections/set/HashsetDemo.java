package com.training.java.core.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {

	public static void main(String[] args) {
		
		Set<String> names = new HashSet<String>();
		
		names.add("Yuri");
		names.add("Venkat");
		names.add("Uma");
		names.add("Sekhar");
		names.add("Yuri");
		
		for(String name : names)
		{
			System.out.println("Name = " + name);
		}
		

	}

}
