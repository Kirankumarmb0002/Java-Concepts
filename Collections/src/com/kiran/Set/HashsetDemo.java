package com.kiran.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HashsetDemo {

	public static void main(String[] args) {
		
		Random object=new Random();
		List<Integer> array1=new ArrayList<>();
		for(int i=0;i<10;i++) {
			int number =object.nextInt(10);
			array1.add(number);
		}
		System.out.println("Array List"+ array1);
		

		Set<Integer> hashdemo=new HashSet<>(array1);
		Set<Integer> hashdemo1=new LinkedHashSet<>(array1);
		
		System.out.println("Hashset"+hashdemo);
		System.out.println("LinkedHashset1"+hashdemo1);
	}

}
