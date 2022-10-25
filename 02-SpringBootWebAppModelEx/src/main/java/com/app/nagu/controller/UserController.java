package com.app.nagu.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.nagu.model.User;

@Controller
public class UserController 
{
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String showHomePage(
			//Model model
			//ModelMap model
			Map<String, Object> model)
	{
		System.out.println(model.getClass().getName());
		
		//model.addAttribute("uname", "Nagaraja");
		//model.addAttribute("cname", "JRTP");
		
		model.put("uname", "Nagaraja");
		model.put("cname", "JRTP");
		
		return "UserHome";
	}
	
	//Sending one user object
	@RequestMapping(value = "/obj", method = RequestMethod.GET)
	public String showUserData(Model model)
	{
		System.out.println(model.getClass().getName());
		
		User user = new User(10, "Nagaraja", "Admin");
		model.addAttribute("obj", user);
		
		List<User> list = Arrays.asList(
				new User(10,"AA","XYZ"),
				new User(11,"AB","XYZ"),
				new User(12,"AC","MNO"),
				new User(13,"AD","MNO")
				);
		
		model.addAttribute("listObj", list);
		
		return "UserData";
	}
}
