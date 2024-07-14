package com.kiran.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityqueueDemo {

	public static void main(String[] args) {
		Queue<Integer> queue=new PriorityQueue<>();
		//Queue<E> q1=new Queue<>();
		
		for(int i=20;i<=30;i++) {
			queue.offer(i);
		}
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.remove());
		System.out.println(queue);
	}

}
