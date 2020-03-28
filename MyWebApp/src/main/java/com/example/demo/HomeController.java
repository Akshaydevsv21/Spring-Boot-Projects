package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
		
//		HttpSession session = req.getSession();
//		String name = req.getParameter("name");
//		System.out.println("hi"+name);
//		//System.out.println("Hi");
//		session.setAttribute("name", name);
		
		ModelAndView md=new ModelAndView();
		md.addObject("obj", alien);
		md.setViewName("home");
		return md;
	}
}
