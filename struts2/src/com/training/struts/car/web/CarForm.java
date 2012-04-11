package com.training.struts.car.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class CarForm extends ActionForm
{
	private String type;
	private String make;
	private String model;
	private int year;
	private double price;

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getMake()
	{
		return make;
	}

	public void setMake(String make)
	{
		this.make = make;
	}

	public String getModel()
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request)
	{
		ActionErrors errors = new ActionErrors();
		
		if(type == null || type.length() == 0)
		{
			errors.add("type", new ActionMessage("type.required"));
		}
		if(make == null || make.length() == 0)
		{
			errors.add("make", new ActionMessage("make.required"));
		}
		if(model == null || model.length() == 0)
		{
			errors.add("model", new ActionMessage("model.required"));
		}
		
		return errors;
	}

}
