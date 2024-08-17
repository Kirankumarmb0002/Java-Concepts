package com.kiran.Maps;

public class User {

	@Override
	public String toString() {
		return "User1";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called");
	}
}
