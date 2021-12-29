package com.tagit.demo.list;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Eset {
	public static void main(String[] args) {
		
		
		Set<Employee> set= new HashSet<Employee>();
		set.add(new Employee(1, "raj",20000));
		set.add(new Employee(2, "ram",40000));
		set.add(new Employee(1, "janu",50000));
		System.out.println(set);
		
	}

}
