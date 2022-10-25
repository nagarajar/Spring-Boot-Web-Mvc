package com.app.nagu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/emp")
public class EmployeeController 
{
	//@GetMapping("/show")
	@RequestMapping(value = {"/show","/home"},
					method = {RequestMethod.GET,
							  RequestMethod.POST})
	public String showHome() {
		return "EmpHome";
	}
}
