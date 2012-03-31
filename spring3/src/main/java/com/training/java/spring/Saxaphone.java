package com.training.java.spring;

import org.springframework.stereotype.Component;

@Component
public class Saxaphone implements Instrument {

	@Override
	public void play() {
		System.out.println("Playing Saxaphone");
	}

}