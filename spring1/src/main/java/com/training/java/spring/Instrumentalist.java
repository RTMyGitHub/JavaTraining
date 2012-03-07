package com.training.java.spring;

public class Instrumentalist {
	
	private Instrument instrument;
	
	public Instrumentalist(Instrument instrument)
	{
		this.instrument = instrument;
	}
	
	public void playInstrument()
	{
		instrument.play();
	}

}
