package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("login")
	public String login() {
		return "login";
	}

	@RequestMapping("/main")
	public String main(String user_id, String password) {
		System.out.println(user_id);
		System.out.println(password);
		return "main";
	}

	@RequestMapping("/board")
	public String board() {
		return "board";
	}

}
