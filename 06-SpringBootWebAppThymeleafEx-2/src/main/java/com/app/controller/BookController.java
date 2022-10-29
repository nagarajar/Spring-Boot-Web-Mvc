package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.Book;

@Controller
@RequestMapping("/book")
public class BookController 
{
	@GetMapping("/show")
	public String showData(Model model) 
	{
		Book b1 = new Book(101, "Core Java", "RAGHU", 200.0);
		model.addAttribute("bob",b1);
		return "BookData";
	}
	
	@GetMapping("/list")
	public String showList(Model model) 
	{
		List<Book> list = Arrays.asList(
				new Book(10, "AA", "XYZ", 200.0),
				new Book(11, "AB", "XYZ", 300.0),
				new Book(12, "AC", "XYZ", 400.0),
				new Book(13, "AD", "MNO", 500.0)
				); 
		model.addAttribute("list",list);
		return "BookList";
	}
	
	@GetMapping("/list/bootstrap")
	public String showListBootStrap(Model model) 
	{
		List<Book> list = Arrays.asList(
				new Book(10, "AA", "XYZ", 200.0),
				new Book(11, "AB", "XYZ", 300.0),
				new Book(12, "AC", "XYZ", 400.0),
				new Book(13, "AD", "MNO", 500.0)
				); 
		model.addAttribute("list",list);
		return "BookListBootStrap";
	}
}