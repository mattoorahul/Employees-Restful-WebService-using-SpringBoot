package com.myproject.springboot.employeecrudrestapi.service;

import java.util.List;

import com.myproject.springboot.employeecrudrestapi.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
