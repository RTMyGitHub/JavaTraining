package com.javavenkat.training.java.corejava.controlflow;
public class SwitchCaseDemo {

	public static void main(String[] args) {

		int score = 60;

		String grade = "";
		
		switch (score) {
		case 95:
			grade = "A";
			break;
			
		case 90:
			grade = "A-";
			break;
			
		case 85:
			grade = "B+";
			break;

		case 80:
			grade = "B-";
			break;

		case 75:
			grade = "C+";
			break;

		case 70:
			grade = "C-";
			break;
			
		default:
			grade = "Fail";
			break;
		}
		
		System.out.println("Your score is " + score + " so your grade is " + grade);

	}

}
