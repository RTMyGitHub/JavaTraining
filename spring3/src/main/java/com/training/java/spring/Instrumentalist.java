package com.training.java.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Instrumentalist {

	@Autowired
	@Qualifier("piano")
	private Instrument instrument;

	public void playInstrument() {
		instrument.play();
	}
}
