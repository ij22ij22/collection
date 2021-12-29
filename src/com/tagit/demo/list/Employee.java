package com.tagit.demo.list;

import java.util.HashSet;

public class Employee implements  Comparable<Employee>  {
	int empid;
	double salary;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @param empid
	 * @param ename
	 */
	public Employee(int empid, String ename,double salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary=salary;
		
	}@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.empid==o.empid) {
		return 0;
	}
		return this.ename.compareTo(o.ename);
	}
	
	
	String ename;
	public boolean equals (Object a)
	{
		Employee e=  (Employee) a;
		return this.empid==e.empid;
	}
	
	
		public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return this.ename;
	}
	public void printStackTrace() {
		// TODO Auto-generated method stub
		
	}

}
