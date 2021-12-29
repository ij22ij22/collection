package com.tagit.demo.list.conn;

import java.util.List;

import com.tagit.demo.list.Employee;

public interface EmployeeService {
	
	void addEmployee(Employee e);
	void getEmployee();
	public List<Employee> getEmployees();
	

}
