package com.kiran.Maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapcomplexDemo {

	private static void hashmapDemo() {
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("Kiran", 46);
		map1.put("Mohan", 57);
		map1.put("Mahesh", 54);
		map1.put("Chethan", 19);
		map1.put("Kiran", 46);
		System.out.println(map1);

		Set<String> names = map1.keySet();
		System.out.println(names);

		Collection<Integer> keysvalue = map1.values();
		System.out.println(keysvalue);

		map1.remove("kiran");
		System.out.println("Interating the map");
		for (String name : names) {
			System.out.println("Keys are " + name + "its values are" + map1.get(name));
		}
		System.out.println("Interating the map through entry set");
		Set<Map.Entry<String, Integer>> entrySetmap = map1.entrySet();
		for (Map.Entry<String, Integer> mapping : entrySetmap) {
			System.out.println("Keys are " + mapping.getKey() + " its values are" + mapping.getValue());
		}

		Map<String, Map<String, Object>> UserProfile = new HashMap<>();
		Map<String, Object> profileMap = new HashMap<>();
		System.out.println(profileMap);
		profileMap.put("age", 25);
		profileMap.put("dept", "cs");
		profileMap.put("Roll Number", 45);
		UserProfile.put("Kiran", profileMap);

		profileMap = new HashMap<>();
		System.out.println(profileMap);
		profileMap.put("age", 26);
		profileMap.put("dept", "cs");
		profileMap.put("Roll Number", 53);
		UserProfile.put("Mahesh", profileMap);
		System.out.println(UserProfile);

		Map<String, Object> profile = UserProfile.get("Kiran");
		int age = (Integer) profile.get("age");
		System.out.println(age);
	}

	private static void immutableKeysDemo() {
		System.out.println("Immenemtable Keys Demo");
		List<Integer> alist = new ArrayList<>();
		Map<List<Integer>, Integer> map1 = new HashMap<>();
		alist.add(20);
		map1.put(alist, 1);
		System.out.println(alist + " " + map1 + "for getting values" + map1.get(alist));
		alist.add(21);
		System.out.println(alist + " " + map1 + "for getting values" + map1.get(alist));
		
		Student1 student=new Student1(1,null);
		Map<Student1,Integer> map2=new HashMap<>();
		map2.put(student, 1);
		System.out.println(map2.get(student));
		student.setName("kiran");
		System.out.println(map2.get(student));
		
	}

	public static void main(String[] args) {
		// hashmapDemo();
		immutableKeysDemo();
	}

}
class Student1{
	private int id;
	private String name;
	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
	
		
	}


