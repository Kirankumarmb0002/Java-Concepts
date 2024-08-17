package com.kiran.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashmapDemo {

	public static void main(String[] args) throws InterruptedException {
		//Map<User,String> user=new HashMap<>();
		Map<User,String> user=new WeakHashMap<>();
		User u1=new User();
		System.out.println(user);
		System.out.println(u1);
		user.put(u1, "tom");
		
		System.out.println(user);
		u1=null;
		
		System.gc();
		Thread.sleep(5000);
		System.out.println(user);
	}

}
