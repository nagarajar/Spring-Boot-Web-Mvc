package com.app.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_table")
public class Employee 
{	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "eid")
	private Integer empId;
	
	@Column(name = "ename")
	private String empName;
	
	@Column(name = "esal")
	private Double empSal;
	
	@Column(name = "ehra")
	private Double empHra;
	
	@Column(name = "eta")
	private Double empTa;
	
	@Column(name = "edept")
	private String empDept;
}
