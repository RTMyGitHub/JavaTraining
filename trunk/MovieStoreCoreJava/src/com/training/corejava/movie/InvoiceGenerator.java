package com.training.corejava.movie;

import java.util.List;

public class InvoiceGenerator {
	
	public String generate(List<Rental> rentals, Promotion promotion)
	{
		double price = new PriceCalculator().calculate(rentals, promotion);
		
		StringBuilder invoice = new StringBuilder();
		
		invoice.append("*****Invoice for the customer****");
		
		for(Rental rental : rentals)
		{
			invoice.append("You are renting " + rental.getMovie().getTitle() + " for " + rental.getNoOfDays());
		}
		
		invoice.append("Your bill is : " + price + " due upon receipt.");
		
		return invoice.toString();
	}

}
