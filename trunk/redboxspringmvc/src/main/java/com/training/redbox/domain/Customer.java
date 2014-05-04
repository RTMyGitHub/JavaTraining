package com.training.redbox.domain;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class Customer {

	private long customerId;

	@NotEmpty
	@Pattern(regexp="[a-z-A-Z]*", message="First name must contain only characters")
	private String firstName;

	@NotEmpty
	@Pattern(regexp="[a-z-A-Z]*", message="Last name must contain only characters")
	private String lastName;

	private String address;
	private String city;
	private String state;

	@NotEmpty
	@Pattern(regexp="[0-9]*", message="Zip code must contain only numbers")
	private String zipCode;

	@NotEmpty
	private String userName;

	@NotEmpty
	private String password;

	public Customer() {

	}

	public Customer(long customerId, String firstName, String lastName) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public long getCustomerId() {
		return customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
