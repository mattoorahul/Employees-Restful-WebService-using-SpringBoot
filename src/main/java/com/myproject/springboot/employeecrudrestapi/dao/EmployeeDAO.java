package com.myproject.springboot.employeecrudrestapi.dao;

import java.util.List;

import com.myproject.springboot.employeecrudrestapi.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}