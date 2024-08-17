package com.kiran.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class DifferntSets {

	public static void main(String[] args) {

		Random obj = new Random();
		HashSet<Integer> setdemo1 = new HashSet<>();
		for (int i = 0; i < 5; i++) {
			int number1 = obj.nextInt(100);
			setdemo1.add(number1);
			System.out.println(number1);
		}
		System.out.println(setdemo1);

		LinkedHashSet<Integer> setdemo = new LinkedHashSet<>();
		for (int i = 0; i < 5; i++) {
			int number = obj.nextInt(100);
			setdemo.add(number);
			System.out.println(number);
		}
		System.out.println(setdemo);
		
		Set<Integer> setdemo2 = new TreeSet<>();
		for (int i = 0; i < 5; i++) {
			int number2 = obj.nextInt(100);
			setdemo2.add(number2);
			System.out.println(number2);
		}
		System.out.println(setdemo2);
	}

}
