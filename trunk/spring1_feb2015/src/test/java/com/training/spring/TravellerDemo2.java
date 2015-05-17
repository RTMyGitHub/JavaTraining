package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TravellerDemo2 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		//Traveller traveller = context.getBean(Traveller.class);
		
		//traveller.travel();
		
		Traveller2 t2 = (Traveller2) context.getBean("traveller2");
		t2.travel();
	}

}
