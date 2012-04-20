package com.training.spring.two;

public class Car
{
	private int id;
	private String type;
	private String make;
	private String model;
	private int year;
	private double price;

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
}
