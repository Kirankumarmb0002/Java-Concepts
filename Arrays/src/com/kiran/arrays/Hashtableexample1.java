package com.kiran.arrays;

import java.util.Hashtable;
import java.util.Map;

public class Hashtableexample1 {

	public static void main(String[] args) {
		Hashtable<Integer,String> hashtables=new Hashtable<Integer, String>();
		hashtables.put(101, "kiran");
		hashtables.put(102, "yashu");
		hashtables.put(103, "Mahesh");
		
		System.out.println(hashtables);
		hashtables.putIfAbsent(101,"Vijay");  
		hashtables.putIfAbsent(104,"Gaurav");
		for(Map.Entry m:hashtables.entrySet()) {
			System.out.println(m.getKey() + " "+ m.getValue());
		}
	}

}
