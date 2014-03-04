package com.kendelong.hellomodule.service;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Service;

@Service
public class MyService
{
	@Autowired
	private SubscribableChannel interappChannel;
	
	private int counter;
	
	@PostConstruct
	public void init()
	{
		interappChannel.subscribe(new MessageHandler()
		{
			@Override
			public void handleMessage(Message<?> message) throws MessagingException
			{
				counter++;
			}
		});
	}
	
	public String munge(String message)
	{
		return "Got " + message + " at " + new Date() + " with counter " + counter;
	}
}
