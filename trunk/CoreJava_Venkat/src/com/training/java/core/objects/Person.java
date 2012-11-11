package com.training.java.core.objects;

public class Person {
	
	String firstName;
	String lastName;
	
	Address address;
	
	int id;
	PhoneNumer phoneNumber;
	
	String email;

	String getFirstName() {
		return firstName;
	}

	void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	String getLastName() {
		return lastName;
	}

	void setLastName(String lastName) {
		this.lastName = lastName;
	}

	Address getAddress() {
		return address;
	}

	void setAddress(Address address) {
		this.address = address;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	PhoneNumer getPhoneNumber() {
		return phoneNumber;
	}

	void setPhoneNumber(PhoneNumer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	String getEmail() {
		return email;
	}

	void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		
		StringBuilder person = new StringBuilder();
		
		person.append(firstName);
		person.append(" ");
		person.append(lastName + "\n");
		person.append(address.toString());
		
		return person.toString();
		
	}
	

}
