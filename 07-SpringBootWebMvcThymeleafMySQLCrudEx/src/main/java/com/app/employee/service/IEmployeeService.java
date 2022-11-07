package com.app.employee.service;

import java.util.List;

import com.app.employee.entity.Employee;


public interface IEmployeeService 
{
	Integer saveEmployee(Employee e);
	
	void updateEmployee(Employee e);
	
	void deleteEmployee(Integer id);
	
	Employee getOneEmployee(Integer id);
	
	List<Employee> getAllEmployee();
}
