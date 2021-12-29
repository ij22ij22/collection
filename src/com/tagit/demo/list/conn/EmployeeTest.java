package com.tagit.demo.list.conn;

import java.sql.SQLException;
import java.util.List;

import com.tagit.demo.list.Employee;

public class EmployeeTest {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
			EmployeeService empservice = new EmployeeServiceImpl();
			List<Employee> l = empservice.getEmployees();
			for(Employee emp : l )
			{
			System.out.println(emp.getEmpid());
			System.out.println(emp.getEname());
			System.out.println(emp.getSalary());
			} }
			}




