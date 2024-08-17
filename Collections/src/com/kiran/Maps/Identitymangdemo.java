package com.kiran.Maps;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Identitymangdemo {

	public static void main(String[] args) {
		//Map<Integer, String> mapdemo2 = new HashMap<>();
		//Map<Integer, String> mapdemo2 = new LinkedHashMap<>();
		Map<Integer, String> mapdemo2 = new IdentityHashMap<>();
		Integer id1 = new Integer(10);
		Integer id2 = new Integer(10);
		Integer id3 = new Integer(12);

		mapdemo2.put(id1,"Bharath");
		mapdemo2.put(id2, "Sarath");
		mapdemo2.put(id3, "Kiran");
		System.out.println(mapdemo2);
	}
}
