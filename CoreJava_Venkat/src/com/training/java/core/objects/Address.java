package com.training.java.core.objects;

public class Address {

	String street;
	String city;
	String state;
	String zip;
	String country;

	public Address(String street, String city, String state, String zip,
			String country) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}

	String getStreet() {
		return street;
	}

	String getCity() {
		return city;
	}

	String getState() {
		return state;
	}

	String getZip() {
		return zip;
	}

	String getCountry() {
		return country;
	}
	
	@Override
	public String toString() {
		
		StringBuffer address = new StringBuffer();
		
		address.append(street);
		address.append("\n");
		address.append(city + " ");
		address.append(state + " ");
		address.append(zip);
		
		return address.toString();
		
	}

}
