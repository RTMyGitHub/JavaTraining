package com.training.java.core.objects;

public class ObjectsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Address address = new Address("8652 Test Dr", "Troy", "MI", "48084", "USA");
		
		Person sirisha = new Person();
		
		sirisha.setFirstName("Sirisha");
		sirisha.setLastName("Last name");
		sirisha.setAddress(address);
		
		System.out.println("Sirisha = " + sirisha);
		
		
	}

}
