package com.training.java.servlet.college.domain;

public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private int age;
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		
		StringBuilder str = new StringBuilder();
		str.append("id = " + id);
		str.append(" city = " + city);
		str.append(" age = " + age);
		str.append(" email = " + email);
		str.append(" firstName = " + firstName);
		str.append(" lastName = " + lastName);
		
		return str.toString();
	}

}
