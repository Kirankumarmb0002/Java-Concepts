package com.kiran.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistDemo {

	public static void main(String[] args) {
		ArrayList<Integer> alist=new ArrayList<Integer>();
		alist.add(10);
		//alist.add(10.12);
	//	alist.add("Strings");
		alist.add(new Integer(20));
		
		System.out.println(alist);
		
		ListIterator<Integer> iter=alist.listIterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println(alist);
		while(iter.hasPrevious()) {
			System.out.println(iter.previous());
		}
	}

	
}
