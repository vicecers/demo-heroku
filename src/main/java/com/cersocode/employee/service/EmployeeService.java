package com.cersocode.employee.service;

import java.util.List;

import com.cersocode.employee.entity.Employee;

public interface EmployeeService {

	//CREATE
	public Employee createEmployee(Employee employee);
	
	//RED
	public List<Employee> listEmployee();
	
	//DELETE
	public void deleteEmployee(Long id);
	
	//UPDATE
	public Employee updateEmployee(Long id, Employee employee);
	
}
