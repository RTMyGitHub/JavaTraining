package com.training.java.core.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<String, String> phoneBook = new LinkedHashMap<String, String>();

		phoneBook.put("Anoop", "123-456-8790");
		phoneBook.put("Leena", "456-879-1234");
		phoneBook.put("Venkat", "8790-123-6754");
		phoneBook.put("Ravi", "123-879-1230");

		Set<String> keys = phoneBook.keySet();

		for (String key : keys) {
			System.out.println("Key = " + key);
			System.out.println("value = " + phoneBook.get(key));
		}
	}

}
