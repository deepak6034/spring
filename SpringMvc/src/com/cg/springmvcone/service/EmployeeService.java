package com.cg.springmvcone.service;

import java.util.List;

import com.cg.springmvcone.dto.Employee;

public interface EmployeeService {

	public void addEmployee(Employee emp);
	public List<Employee> showAllEmployee();
	public Employee searchEmployee(Employee emp);
	public void updateEmployee(Employee emp);
}
