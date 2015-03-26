package com.training.java.core.collections.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		Map<String, String> phoneBook = new TreeMap<String, String>();
		
		phoneBook.put("Venkat", "8790-123-6754");
		phoneBook.put("Ravi", "123-879-1230");
		phoneBook.put("Anoop", "123-456-8790");
		phoneBook.put("Leena", "456-879-1234");
		
		Set<String> keys = phoneBook.keySet();

		for (String key : keys) {
			System.out.println("Key = " + key);
			System.out.println("value = " + phoneBook.get(key));
		}
		
		

	}

}
