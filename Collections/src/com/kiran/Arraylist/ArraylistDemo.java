package com.kiran.Arraylist;

import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {
		ArrayList<Integer> alist=new ArrayList<Integer>();
		alist.add(10);
		//alist.add(10.12);
	//	alist.add("Strings");
		alist.add(new Integer(20));
		
		System.out.println(alist);
	}

	
}
