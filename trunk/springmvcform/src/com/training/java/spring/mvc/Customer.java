package com.training.java.spring.mvc;

public class Customer {

	private String firstName;
	private String lastName;
	private int age;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		
		StringBuilder str = new StringBuilder();
		str.append("First name = " + getFirstName() + " , ");
		str.append("Last name = " + getLastName() + " , ");
		str.append("Age = " + getAge());
		
		return str.toString();
	}
}
