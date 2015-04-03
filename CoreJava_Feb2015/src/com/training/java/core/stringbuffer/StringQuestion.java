package com.training.java.core.stringbuffer;

public class StringQuestion {

	public static void main(String[] args) {
		
		//Given a sentence of words separated by spaces, reverse the words.
		//Example1 : "World is beautiful" should return "beautiful is World"
		//Example2 : "Pen is mightier than sword" should return "sword than mightier is Pen"
		
		//Get the arraof words separated by space
		
		String str = "Pen is mightier than sword";
		
		String[] words = str.split(" ");
		System.out.println(words.length);
		
		int length = words.length;
		
		StringBuffer reversedString = new StringBuffer();
		for(int i = length-1; i>=0; i--)
		{
			reversedString.append(words[i]);
			
			if(i != 0)
			{
				reversedString.append(" ");
			}
		}
		
		System.out.println(reversedString.toString());
	}

}
