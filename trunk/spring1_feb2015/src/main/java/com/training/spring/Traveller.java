package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Traveller {
	
	@Autowired
	@Qualifier("uma")
	private Vehicle vehicle;
	
	public void travel() {
		vehicle.start();
		vehicle.drive();
		vehicle.stop();
	}
}
