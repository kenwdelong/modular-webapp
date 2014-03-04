package com.kendelong.goodbyemodule.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kendelong.goodbyemodule.service.MyService;

@Controller("goodbyeController")
public class MyController
{
	@Autowired
	private MyService myService;
	
	@RequestMapping("/go")
	public String hello(Model model)
	{
		String message = myService.munge("goodbye");
		model.addAttribute("message", message);
		System.out.println("Dispatched to goodbye");
		return "hello";
	}
}
