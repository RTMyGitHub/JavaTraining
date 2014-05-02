package com.training.java.spring.mvc;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class Customer {

	@NotEmpty
	private String firstName;

	@NotEmpty
	private String lastName;

	@Range(min = 20)
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
