package com.training.java.core.collections.set;

public class Student {

	private long id;
	private String name;
	private String city;
	private String state;
	private String zip;

	public Student(long id, String name, String city, String state, String zip) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Student))
		{
			return false;
		}
		
		Student student = (Student) obj;
		
		return this.id == student.getId();
	}
	
	@Override
	public int hashCode() {

		return (int) this.id;
		
	}

}
