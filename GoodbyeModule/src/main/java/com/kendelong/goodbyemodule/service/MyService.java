package com.kendelong.goodbyemodule.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Service;

@Service("goodbyeService")
public class MyService
{
	@Autowired
	private MessageChannel interappChannel;
	
	public String munge(String message)
	{
		interappChannel.send(new GenericMessage<String>("hi"));
		return "Goodbye: " + message + " at " + new Date();
	}
}
