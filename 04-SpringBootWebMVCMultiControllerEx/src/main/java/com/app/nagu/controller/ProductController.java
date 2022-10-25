package com.app.nagu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/prod")
public class ProductController 
{
	@GetMapping("/show")
	public String showHome() {
		return "ProdData";
	}
}
