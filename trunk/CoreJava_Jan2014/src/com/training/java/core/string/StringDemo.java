package com.training.java.core.string;

/**
 * This class demonstrates how String is an immutable object. For example,
 * 
 * every single time you call concat method, you are creating a brand new object.
 * 
 * 
 * @author Venkata
 *
 */
public class StringDemo {

	/**
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//String str = new String("JavaTraining");
		String str = "JavaTraining";
		
		for(int i=0; i<100; i++)
		{
			str = str.concat(" By Venkat Hari");
			System.out.println("str = " + str);
		}
	}

}
