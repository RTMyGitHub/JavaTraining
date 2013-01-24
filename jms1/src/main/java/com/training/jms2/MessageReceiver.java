package com.training.jms2;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Queue;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Autowired
	@Qualifier("statementProcessingQueue")
	private Queue statementProcessingQueue;

	public void receiveMessage() throws JMSException
	{
		Message message = jmsTemplate.receive(statementProcessingQueue);
		if (message instanceof TextMessage)
		{
			TextMessage textMsg = (TextMessage) message;
			System.out.println("Message received was " + textMsg.getText());
		}
	}

	

}
