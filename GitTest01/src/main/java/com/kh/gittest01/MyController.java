package com.kh.gittest01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello() throws Exception	{
		System.out.println("Hi");
		return "home";
	}

}
