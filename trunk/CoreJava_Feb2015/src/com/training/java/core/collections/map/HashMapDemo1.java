package com.training.java.core.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		Map<String, String> phoneBook = new HashMap<String, String>();
		
		phoneBook.put("Anoop", "123-456-8790");
		phoneBook.put("Leena", "456-879-1234");
		phoneBook.put("Venkat", "8790-123-6754");
		phoneBook.put("Ravi", "123-879-1230");
		
		//scenario1 : if you know key, you can get the value
		String ravisNo = phoneBook.get("Ravi");
		System.out.println("Ravi's number = " + ravisNo);
		
		String leenaNo = phoneBook.get("Leena");
		System.out.println("Leena's number = " + leenaNo);
		
		//scenario2 : Get all the keys from Map
		Set<String> keys = phoneBook.keySet();
		
		for(String key : keys)
		{
			System.out.println("Key = " + key);
			System.out.println("value = " + phoneBook.get(key));
		}
		
		//scenario3 : get all the entries from Map
		Set<Entry<String, String>> entries = phoneBook.entrySet();
		
		for(Entry<String, String> entry : entries)
		{
			System.out.println("key = " + entry.getKey());
			System.out.println("Value = " + entry.getValue());
		}
	}

}
