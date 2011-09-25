package com.training.java.spring;

public class Traveller
{
	private Vehicle v;
	private Luggage l;
	
	public Traveller(Vehicle v, Luggage l)
	{
		this.v = v;
		this.l = l;
	}
	
	public void travel()
	{
		System.out.println("started travelling with " + l.getCompanyName());
		v.start();
		v.accelerate();
		v.applyBrakes();
		v.stop();
		System.out.println("Done with travelling");
	}
	
	/* Use this for setter injection
	public void setVehicle(Vehicle v)
	{
		this.v = v;
	}
	*/
}
