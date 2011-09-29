package com.training.java.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TravellerDemo
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		/* Dependency Injection by hand
		Vehicle v = new Boat();
		Traveller t = new Traveller(v);
		//t.setVehicle(v);
		
		t.travel();
		*/

		BeanFactory factory = new ClassPathXmlApplicationContext("spring-config.xml");
		
		Traveller traveller = (Traveller) factory.getBean("traveller");
		traveller.travel();
	}

}
