package com.kiran.Maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashmapBasicDemo2 {

	public static void main(String[] args) {

		Map<String, Integer> mapdemo = new LinkedHashMap<>();
		mapdemo.put("Ananya", 68);
		mapdemo.put("Depak", 78);
		mapdemo.put("Kiran", 28);
		mapdemo.put("Ana", 98);
	
		Set<String> keySet = mapdemo.keySet();
		System.out.println("THE key values are"+keySet );
		
		Collection<Integer> values = mapdemo.values();
		System.out.println("THE  values are"+values );
	
		for(String key:keySet) {
			System.out.println("The Key are " +key + " & its Value =" + mapdemo.get(key));
		}
	}
}
