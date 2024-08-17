package com.kiran.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dequeTest();
	}

	private static void dequeTest() {
		Deque<String> deque =new ArrayDeque<>();
		
		deque.add("Kiran");
		deque.add("Mohan");
		deque.add("Yatish");
		
		System.out.println("Printing queue \n" +deque);
		System.out.println(deque.remove());
		System.out.println(deque.pollLast());
		System.out.println(deque.remove());
		System.out.println("Printing queue \n" +deque);
		
		//stack
		deque.push("Kiran");
		deque.offer("Yatish");
		deque.push("Mahesh");
		
		System.out.println("Printing Stack \n" +deque);
		System.out.println(deque.pop());
		System.out.println(deque.poll());
		System.out.println(deque.pop());
		System.out.println("Printing queue \n" +deque);
	}

}
