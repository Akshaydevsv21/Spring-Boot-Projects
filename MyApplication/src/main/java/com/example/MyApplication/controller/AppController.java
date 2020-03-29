package com.example.MyApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {
	
	@ResponseBody
	@RequestMapping("/home")
	public String home() {
		return "Hello from Java";
	}
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
}
