package com.training.springmvc.car.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Car
{
	private int id;
	
	@NotNull(message="Type cannot be null!")
	@Size(min=3, max=5, message="Type must be between 3 and 5 characters")
	private String type;
	
	@NotNull(message="Make cannot be null!")
	@Size(min=4, max=30, message="Make must be between 4 and 30 characters")
	private String make;
	private String model;
	private int year;
	private double price;

	public Car()
	{
	}

	public Car(int id, String type, String make, String model, int year,
			double price)
	{
		this(type, make, model, year, price);
		this.id = id;
	}

	public Car(String type, String make, String model, int year, double price)
	{
		this.type = type;
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public int getId()
	{
		return id;
	}

	public String getMake()
	{
		return make;
	}

	public String getModel()
	{
		return model;
	}

	public int getYear()
	{
		return year;
	}

	public double getPrice()
	{
		return price;
	}

	public String getType()
	{
		return type;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public void setMake(String make)
	{
		this.make = make;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

}
