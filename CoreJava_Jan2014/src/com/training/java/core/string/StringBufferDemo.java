package com.training.java.core.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("JavaTraining");
		
		for(int i=0; i<100; i++)
		{
			sb.append(" By Venkat Hari");
			System.out.println("str = " + sb.toString());
		}
		
	}

}
