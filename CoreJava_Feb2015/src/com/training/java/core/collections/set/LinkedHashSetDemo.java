package com.training.java.core.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		Set<String> names = new LinkedHashSet<String>();

		names.add("Yuri");
		names.add("Venkat");
		names.add("Uma");
		names.add("Sekhar");
		names.add("Yuri");
		
		for (String name : names) {
			System.out.println("Name = " + name);
		}

	}

}
