package com.training.java.jdbc.teamdao.television;

public class Television {


	private int tvId ;
	private String company;
	private String type;
	private boolean enable3d;
	private double  price;
	
	public Television (int tvId, String company, String type,boolean enable3d, double price) {
		super();
		this.tvId = tvId;
		this.company = company;
		this.type = type;
		this.enable3d = enable3d;
		this.price = price;
	}
	
	int getTvId() {
		return tvId;
	}
	String getCompany() {
		return company;
	}
	String getType() {
		return type;
	}
	boolean isEnable3d() {
		return enable3d;
	}
	double getPrice() {
		return price;
	}
}
