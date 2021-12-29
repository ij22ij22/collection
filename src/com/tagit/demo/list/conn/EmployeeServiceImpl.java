package com.tagit.demo.list.conn;

import com.tagit.demo.list.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;//import oracle.jdbc.driver.OracleDriver;import com.tagit.day5.empoyeeapp.dao.ConnectionDAO;


public class EmployeeServiceImpl  implements EmployeeService{

	@Override
	public void addEmployee(Employee e) {
		Connection con=ConnectionDAO.getConnection();
		System.out.println("Connection object is availble for getEmployee");
		try {
		PreparedStatement pst=
		con.prepareStatement("insert into employee values ");
		pst.setInt(1, e.getEmpid());
		pst.setString(2, e.getEname());
		pst.setDouble(3,e.getSalary());
		pst.execute();
		//st.execute("insert into employee values("+emp.getEmpId()+",'"+emp.getEmpName()+"',"+emp.getSalary()+")");
		} catch (SQLException a) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
	}

	@Override 
	public void getEmployee() {
		// TODO Auto-generated method stub
		}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		List<Employee> empList=null;
		try {
		Connection con=ConnectionDAO.getConnection();
		Statement statement=con.createStatement();
		ResultSet rs=statement.executeQuery("select * from employee");
		empList=new ArrayList<Employee>();
		while(rs.next())
		{
		empList.add(new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3)));
		}
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		}
		return null;
	}
	

}
