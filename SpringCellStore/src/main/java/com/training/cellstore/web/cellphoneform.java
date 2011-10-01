package com.training.cellstore.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class cellphoneform extends ActionForm {
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
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		ActionErrors errors = new ActionErrors();
		
		if(cellid == 0)
		{
			errors.add("cellid", new ActionMessage("cellid.required"));
		}
		if(cellCompanyname == null || cellCompanyname.trim().equals(""))
		{
			errors.add("cellCompanyname", new ActionMessage("cellCompanyname.required"));
		}
		
		if(cellCompanyname.length() > 30)
		{
			errors.add("cellCompanyname", new ActionMessage("cellCompanynamelength.exceed"));
		}
			
		if (model == null || model.trim().equals(""))
		{
			errors.add("model", new ActionMessage("model.required"));
		}
		if(price == 0)
		{
			errors.add("price", new ActionMessage("price.required"));
		}
		
		return errors;
	}
}
