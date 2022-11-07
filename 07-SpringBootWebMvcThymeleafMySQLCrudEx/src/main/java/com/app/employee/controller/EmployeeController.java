package com.app.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.employee.entity.Employee;
import com.app.employee.service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController 
{
	@Autowired
	private IEmployeeService service;
	
	/**
	 * 1. SHOW THE REGISTER PAGE
	 * This method is used to display Register Page
	 * when end-user enters /register with GET Type
	 */
	@GetMapping("/register")
	public String showRegisterPage()
	{
		return "EmployeeRegister";
	}
	
	
	/**
	 * 2. ON CLICK FORM SUBMIT, READ DATA (@MODELATTRIBUTE)
	 * This method is used to read Form data as Model Attribute
	 * It will make call to service method by passing same form object
	 * Service method returns PK(ID). 
	 * Controller returns String message back to UI using Model
	 * @param employee
	 * @param model
	 * @return
	 */
	@PostMapping("/save")
	public String showRegisterPage(
			//Form to Controller
			@ModelAttribute Employee employee,
			//Controller to Form
			Model model)
	{
		Integer id = service.saveEmployee(employee);
		String message = new StringBuffer().append("EMPLOYEE ID = '")
				.append(id).append("' CREATED ").toString();
		model.addAttribute("message", message);
		return "EmployeeRegister";
	}
	
	
	/**
	 * 3. Display all rows as a table
	 * This method is executed for request URL /all + GET.
	 * It will fetch data from Service as List<T>
	 * Send this data to UI(View) using Model(I)
	 * In UI use th:each="tempVariable:${collectionName}" to read data 
	 * and print as HTML Table.
	 * @param model
	 * @return
	 */
	@GetMapping("/all")
	public String showData(Model model) 
	{
		List<Employee> list = service.getAllEmployee();
		model.addAttribute("list", list);
		return "EmployeeData";
	}
	
	//4. DELETE BASED ON ID
	@DeleteMapping("/delete")
	public void deleteData(@RequestParam("id") int id)
	{
		service.deleteEmployee(id);
	}
	
	//5. ON CLICK EDIT LINK(HyperLink) SHOW DATA IN EDIT FORM
	
	//6. UPDATE FORM DATA AND SUBMIT
}

