package com.tagit.demo.list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Map{
	public static void main(String[] args) {
		
		
		Map<Integer,String> map= new HashMap<Integer, String>();
		
	map.put(1, "ram");
	
	map.put(2, "raj");
	map.put(3, "janu");
	map.put(4, "ravi");
	System.out.println(map);
	
	
	for (Entry<Integer, String> data:map.entrySet()) {
		System.out.println(data);
	}
	
}
}
