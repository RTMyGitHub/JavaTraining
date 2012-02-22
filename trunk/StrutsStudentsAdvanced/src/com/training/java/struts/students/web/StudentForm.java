package com.training.java.struts.students.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class StudentForm extends ActionForm {

	private String firstName;
	private String lastName;
	private int age;
	private int id;
	private String phone;
	private String email;
	private String city;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		
		ActionErrors errors = new ActionErrors();
		
		if(firstName == null || firstName.trim().length() == 0)
		{
			errors.add("firstNameRequired", new ActionMessage("firstName.required"));
		}

		if(lastName == null || lastName.trim().length() == 0)
		{
			errors.add("lastNameRequired", new ActionMessage("lastName.required"));
		}
		
		if(id == 0)
		{
			errors.add("idRequired", new ActionMessage("id.required"));
		}
		
		return errors;
	}

}
