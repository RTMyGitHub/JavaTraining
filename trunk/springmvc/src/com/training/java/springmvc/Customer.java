package com.training.java.springmvc;

public class Customer {
	
		private long customerId;
		private String firstName;
		private String lastName;
		private String address;
		private String city;
		private String state;
		private String  zipCode;
		private String userName;
		private String password;

		public Customer()
		{
			
		}
		public Customer(long customerId,String firstName,String lastName)
		{
			this.customerId=customerId;
			this.firstName=firstName;
			this.lastName=lastName;
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
		

		}
