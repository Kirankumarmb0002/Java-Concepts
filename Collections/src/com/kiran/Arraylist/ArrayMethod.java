package com.kiran.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayMethod {

	public static void main(String[] args) {
		List<Integer> alist = new ArrayList<>();

		for (int i = 10; i <= 100; i = i + 10) {
			alist.add(i);
		}
		System.out.println(alist);

		alist.add(3, 25);
		System.out.println("After addition of elements" + alist);

		alist.set(3, 35);
		System.out.println("After replacing of elements" + alist);

		List<Integer> blist = new ArrayList<>();
		blist.add(101);
		blist.add(201);
		blist.add(301);
		System.out.println(blist);
		alist.addAll(0, blist);
		System.out.println(alist);
		System.out.println(alist.contains(201));

		Iterator<Integer> iterator = alist.iterator();
		while (iterator.hasNext()) {
			int element = iterator.next();
			System.out.println("element" + element);
			if (element == 101) {
				iterator.remove();
			}
		}
		System.out.println("All elements" + alist);

		for (ListIterator<Integer> iterator1 = alist.listIterator(); iterator1.hasNext();) {
			System.out.println("iterator1.nextIndex()" + iterator1.nextIndex() + " ," + iterator1.next());
			if (iterator1.nextIndex() == 2) {
				System.out.println("Adding an int");
				iterator1.add(10101);
				System.out.println(alist);
				System.out.println("iterator1.nextIndex()" + iterator1.nextIndex() + " ," + iterator1.next());
				iterator1.previous();
				iterator1.previous();
				iterator1.remove();
				System.out.println(alist);
			}

		}

	}

}
