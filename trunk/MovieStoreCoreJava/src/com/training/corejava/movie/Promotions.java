package com.training.corejava.movie;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Promotions {
	
	private static Set<Promotion> promotionSet;
	private static final Date today = new Date();
	
	static
	{
		promotionSet = new HashSet<>();
		
		Calendar apr30 = Calendar.getInstance();
		apr30.set(2014, Calendar.APRIL, 30);
		
		Calendar mar15 = Calendar.getInstance();
		mar15.set(2014, Calendar.MARCH, 15);
		
		Calendar jan10 = Calendar.getInstance();
		jan10.set(2014, Calendar.JANUARY, 10);
		
		
		Promotion promotion1 = new Promotion("20PR", apr30.getTime(), 20);
		Promotion promotion2 = new Promotion("25PR", mar15.getTime(), 25);
		Promotion promotion3 = new Promotion("30PR", jan10.getTime(), 30);
		
		promotionSet.add(promotion1);
		promotionSet.add(promotion2);
		promotionSet.add(promotion3);
		
	}
	
	public Promotion getPromotion(String promotionCode) throws InvalidPromotionException
	{
		for (Promotion pr : promotionSet) {
			
			if (promotionCode.equals(pr.getCode()) && pr.getExpirationDate().after(today)) {
				return pr;
			} 
		}
		
		throw new InvalidPromotionException("Promotion code " + promotionCode + " is not valid or expired.");
	}

}
