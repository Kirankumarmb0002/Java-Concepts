package com.kiran.Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StringBufferTreeSet {
	public static void main(String[] args) {

		Set<StringBuffer> treesetdemo = new TreeSet<>(new Sbccomparotor());

		treesetdemo.add(new StringBuffer("redapple"));
		treesetdemo.add(new StringBuffer("kite"));
		treesetdemo.add(new StringBuffer("cricketball"));
		treesetdemo.add(new StringBuffer("dessert in camel"));
		System.out.println("String bufferTree Set=" + treesetdemo);

		for (StringBuffer strobj : treesetdemo) {
			System.out.println(strobj);
		}

	}
}
