package com.training.cellstore.domain;

public class Cellphone {
	
	private int cellid;
	private String cellCompanyname;
	private String model;
	private float price;
	public int getCellid() {
		return cellid;
	}
	public void setCellid(int cellid) {
		this.cellid = cellid;
	}
	public String getCellCompanyname() {
		return cellCompanyname;
	}
	public void setCellCompanyname(String cellCompanyname) {
		this.cellCompanyname = cellCompanyname;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	
}
