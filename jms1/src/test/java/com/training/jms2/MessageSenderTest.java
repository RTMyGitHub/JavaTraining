package com.training.jms2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config.xml")
public class MessageSenderTest {

	@Autowired
	private MessageSender messageSender;

	@Test
	public void testSend() throws Exception {

		// Read from command line
		BufferedReader commandLine = new java.io.BufferedReader(new InputStreamReader(System.in));
		
		// Loop until the word "exit" is typed
		while (true) {
			String stringLine = commandLine.readLine();
			if (stringLine.equalsIgnoreCase("exit")) {
				System.exit(0);
			} else
				messageSender.sendMessage(stringLine);
		}
	}

}
