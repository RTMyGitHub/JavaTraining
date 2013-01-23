package com.training.jms2;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Queue;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessagePoller {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Autowired
	private Queue testQueue;

	public void receiveMessage() throws JMSException
	{
		Message message = jmsTemplate.receive(testQueue);
		if (message instanceof TextMessage)
		{
			TextMessage textMsg = (TextMessage) message;
			System.out.println("Message received was " + textMsg.getText());
		}
	}

	

}
