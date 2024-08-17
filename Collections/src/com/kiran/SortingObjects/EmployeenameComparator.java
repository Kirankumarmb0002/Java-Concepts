package com.kiran.SortingObjects;

import java.util.Comparator;

public class EmployeenameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		String s1 = o1.name;
		String s2 = o2.name;
		return s1.compareTo(s2);
		/*
		 * if(s1.length()>s2.length()) { return 1; } else if(s1.length()<s2.length()) {
		 * return -1; } else {
		 * 
		 * }
		 */
	}

}
