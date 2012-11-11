package com.training.java.core.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		
		names.add("Vasu");
		names.add("Vasu");
		names.add("Sirisha");
		names.add("Sirisha");
		names.add("Kranthi");
		names.add("Rajani");
		names.add("Rajani");
		names.add(null);
		names.add("Davuluri");
		names.add("Chaitra");
		names.add("Gayathri");
		names.add("Geetha");
		names.add("Irfaan");
		names.add("Irfaan");
		names.add("Sekhar");
		names.add("Sunitha");
		names.add(null);
		names.add("Sunitha");
		
		for(String name : names)
		{
			System.out.println("Name = " + name);
		}
	}

}
