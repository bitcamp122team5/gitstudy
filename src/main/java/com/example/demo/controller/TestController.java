package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("main")
	String main() {
		return "main";
	}

	@RequestMapping("login")
	public String login() {
		
		return "login";
	}
	
}
