package com.tagit.demo.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		List<String> l= new ArrayList<String>();
		l.add("hii");
		l.add("welcome");
		l.add("india");
		System.out.println(l);
		for (String st : l) {
			System.out.println(st);
			
		}
		l.add(1, "come");
		System.out.println(l);
		
		boolean contains = l.contains("hii");
		System.out.println(contains);
		
		boolean equals = l.equals("welcome");
		System.out.println(equals);
		
		int indexOf = l.indexOf("hii");
		System.out.println(indexOf);
			
		int lastIndexOf = l.lastIndexOf("india");
		System.out.println(lastIndexOf);
		
		int size = l.size();
		System.out.println(size);
		
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);
		
		Object[] array = l.toArray();
		for (int i = 0; i < array.length; i++) {
			
		
		System.out.println(array);
		}
	}
			
		
		

	

}
