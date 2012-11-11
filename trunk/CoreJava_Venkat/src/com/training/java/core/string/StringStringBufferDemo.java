package com.training.java.core.string;

public class StringStringBufferDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String name = "Gayathri    ";
		name = name.trim();
		
		System.out.println("Name = -->" + name + "<--");
		//System.out.println("Trimmed Name = -->" + trimmedName + "<--");
		
		StringBuffer sbName = new StringBuffer("Chaitra");
		sbName.append(":Davuluri:");
		sbName.append(":Gayathri:");
		
		System.out.println("sbName = " + sbName);
		
		//String name = new String("Venkat");
		
		
	}

}
