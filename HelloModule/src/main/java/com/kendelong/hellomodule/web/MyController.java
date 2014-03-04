package com.kendelong.hellomodule.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kendelong.hellomodule.service.MyService;

@Controller
public class MyController
{
	@Autowired
	private MyService myService;
	
	@Autowired
	@Qualifier("rootMessage")
	private String rootMessage;
	
	@RequestMapping("/go")
	public String hello(Model model)
	{
		String message = myService.munge("hello");
		model.addAttribute("message", message + rootMessage);
		System.out.println("Dispatched to hello");
		return "hello";
	}
}
