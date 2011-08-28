package com.training.java.core.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Venkat
 *
 */
public class HashMapDemo
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Map<String, String> telephoneDirectory = new HashMap<String, String>();
		
		telephoneDirectory.put("venkat", "2482295135");
		telephoneDirectory.put("prasad", "2482029187");
		telephoneDirectory.put("Soumith", "2482022951");
		
		String soumithsNumber = telephoneDirectory.get("Soumith");
		System.out.println("soumithsNumber = " + soumithsNumber);
	}

}
