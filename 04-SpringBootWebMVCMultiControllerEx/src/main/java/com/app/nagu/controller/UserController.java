package com.app.nagu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/user")
public class UserController 
{
	
	@RequestMapping(value = {"/","/home","/login"},
					method = RequestMethod.GET)
	public String showHome() {
		return "UserHome";
	}
}
