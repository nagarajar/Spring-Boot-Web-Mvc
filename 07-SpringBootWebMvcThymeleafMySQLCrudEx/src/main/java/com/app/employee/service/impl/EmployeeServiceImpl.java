package com.app.employee.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.employee.entity.Employee;
import com.app.employee.repo.EmployeeRepository;
import com.app.employee.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService 
{
	@Autowired
	private EmployeeRepository repo;
	
	public Integer saveEmployee(Employee e) {
		double hra = e.getEmpSal() * (12.0/100);
		double ta = e.getEmpSal() * (4.0/100);
		e.setEmpHra(hra);
		e.setEmpTa(ta);
		e = repo.save(e);
		return e.getEmpId();
	}

	public void updateEmployee(Employee e) {
		repo.save(e);
	}

	public void deleteEmployee(Integer id) {
		repo.deleteById(id);
	}

	public Employee getOneEmployee(Integer id) {
		Optional<Employee> opt = repo.findById(id);
		return opt.get();
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> list = repo.findAll();
		return list;
	}
}
