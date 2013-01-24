package com.training.jms2;

import javax.jms.JMSException;
import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender
{
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Autowired
	@Qualifier("statementProcessingQueue")
	private Queue testQueue;

	public void sendMessage(String message) throws JMSException
	{
		System.out.println("Sending the message .." + message);
		jmsTemplate.convertAndSend(testQueue, message);
	}
}