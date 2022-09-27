package com.cersocode.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cersocode.employee.entity.Employee;
import com.cersocode.employee.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> listEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public Employee updateEmployee(Long id, Employee employee) {
		Employee emp = employeeRepository.findById(id).get();
		emp.setName(employee.getName());	
		return employeeRepository.save(emp);
	}

}
