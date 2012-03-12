package com.training.java.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstrumentalistTest {
	
	@Test
	public void testPlayInstrument() throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Instrumentalist instrumentalist = (Instrumentalist) context.getBean("jiten");
		
		instrumentalist.playInstrument();
	}

}
