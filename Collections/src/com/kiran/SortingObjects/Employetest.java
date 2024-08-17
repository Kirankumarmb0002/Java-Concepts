package com.kiran.SortingObjects;

import java.util.Set;
import java.util.TreeSet;

public class Employetest {

	public static void main(String[] args) {
		Set<Employee> set = new TreeSet<>(new EmployeenameComparator());
		set.add(new Employee(100, "kiran"));
		set.add(new Employee(400, "yashodhar"));
		set.add(new Employee(300, "mohan"));
		set.add(new Employee(200, "yashu"));
		for(Employee emp:set) {
			System.out.print("Employee id is" +emp.id + "   ");
			System.out.println("Employee name is" +emp.name);
		}
	}

}
