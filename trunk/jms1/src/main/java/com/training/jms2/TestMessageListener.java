package com.training.jms2;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class TestMessageListener implements MessageListener {

	public void onMessage(Message message) {
		System.out.println("onMessage called");
		
		if (message instanceof TextMessage) {
			try {
				String msgText = ((TextMessage) message).getText();
				System.out.println("Received the message: " + msgText);
			} catch (JMSException ex) {
				ex.printStackTrace();
			}
		} else {
			throw new RuntimeException("Message is not of expected type!!");
		}
	}

}
