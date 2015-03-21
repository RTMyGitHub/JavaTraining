package com.javavenkat.training.java.corejava.controlflow;

public class IfElseDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 75;
		
		String grade = "initial value";
		
		if(score == 95)
		{
			grade = "A";
		} else if(score == 90)
		{
			grade = "A-";
		} else if(score == 85)
		{
			grade = "B+";
		} else if(score == 80)
		{
			grade = "B-";
		} else if(score == 75)
		{
			grade = "C+";
		} else if(score == 70)
		{
			grade = "C-";
		} else {
			grade = "Fail";
		}
		
		System.out.println("Your score is " + score + " so your grade is " + grade);

	}

}
