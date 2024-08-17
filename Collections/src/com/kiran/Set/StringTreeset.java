package com.kiran.Set;

import java.util.Set;
import java.util.TreeSet;

public class StringTreeset {

	public static void main(String[] args) {
		Set<String> treesetdemo = new TreeSet<>(new StringComparator());
		treesetdemo.add("apple gives a doctor away");
		treesetdemo.add("kite is in sky");
		treesetdemo.add("batman ");
		treesetdemo.add("camel is as in dessert");

		for (String obj : treesetdemo) {
			System.out.println(obj);
		}
		System.out.println("Tree Set=" + treesetdemo);
	}

}
