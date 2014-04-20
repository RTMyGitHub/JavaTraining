package com.training.java.redbox;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.Globals;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class CustomerForm extends ActionForm {

	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String userName;
	private String password;
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
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("First name = " + firstName);
		sb.append("Last name = " + lastName);
		
		return sb.toString();
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		
		ActionErrors errors = new ActionErrors();
		
		if(firstName == null || firstName.trim().equals(""))
		{
			errors.add(Globals.MESSAGES_KEY, new ActionMessage("firstname.required"));
		}
		if(lastName == null || lastName.trim().equals(""))
		{
			errors.add(Globals.MESSAGES_KEY, new ActionMessage("lastName.required"));
		}
		if(zipCode == null || zipCode.trim().equals(""))
		{
			errors.add(Globals.MESSAGES_KEY, new ActionMessage("zipCode.required"));
		}
		if(userName == null || userName.trim().equals(""))
		{
			errors.add(Globals.MESSAGES_KEY, new ActionMessage("userName.required"));
		}
		if(password == null || password.trim().equals(""))
		{
			errors.add(Globals.MESSAGES_KEY, new ActionMessage("password.required"));
		}
		
		return errors;
	}

}
