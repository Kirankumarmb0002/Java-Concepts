package com.kiran.Arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class LinkedListDemo {

	public static void main(String[] args) {
		Object objects[]=new Object[1000000];
		
		for(int i=0;i<objects.length;i++) {
			objects[i]=new Object();
		}
		LinkedList<Object> list2=new LinkedList<>();
		//List<Object> list=new ArrayList<>();
		long start =System.currentTimeMillis();
		for(Object object:objects) {
			list2.add(object);
		}
		long end =System.currentTimeMillis();
		System.out.println(end -start);
	}

}
