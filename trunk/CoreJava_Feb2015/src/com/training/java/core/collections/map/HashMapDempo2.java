package com.training.java.core.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDempo2 {

	public static void main(String[] args) {
		
		Map<String, List<String>> phoneBook = new HashMap<String, List<String>>();
		
		List<String> yurisPhoneNumbers = phoneBook.get("Yuri");
		
		if(yurisPhoneNumbers == null)
		{
			yurisPhoneNumbers = new ArrayList<String>();
			
			yurisPhoneNumbers.add("1234");
		} else {
			yurisPhoneNumbers.add("1234");
		}
	}

}
