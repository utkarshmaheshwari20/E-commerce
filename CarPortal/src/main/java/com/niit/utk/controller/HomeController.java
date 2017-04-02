package com.niit.utk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	public HomeController() {
	System.out.println("Home Controller instintiated");
	}
	
	@RequestMapping({"/index","/"})
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/aboutus")
	public String aboutUs()
	{
		return "aboutus";
	}
	
	@RequestMapping("/contactus")
	public String contactus()
	{
		return "contactus";
	}
	
}
