package com.app.nagu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.nagu.model.Employee;

@Controller
public class EmployeeController 
{
	//1. To display HTML form in browser
	//PATH: show     HTTP method: GET
	@GetMapping("/show")
	public String showForm() {
		return "EmpRegister";
	}
	
	//2. To read data from HTML FORM(ModelAttribute)
	//PATH: /register  HTTP method: POST
	@PostMapping("/register")
	public String readData(@ModelAttribute Employee employee, Model model) 
	{
		System.out.println(employee);
		model.addAttribute("obj", employee);
		return "EmpData";
	}
}
