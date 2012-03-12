package com.training.java.spring;

public class Instrumentalist {

	private Instrument instrument;

	public void playInstrument() {
		instrument.play();
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
}
