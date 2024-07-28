package com.practice.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQuuu {
	
	public static void main(String[] args) {
		
		//priority queue is not sorted
		//Queue<Integer> qq = new PriorityQueue<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		pq.add(5);
		
		pq.poll();//this method is use to remove smallest value from pq
		pq.peek();//this method is use to retrive the smallest value from pq
		
		while (!pq.isEmpty()) {
			System.out.println(pq.poll()); // Prints elements in ascending order
		}
			
		System.out.println(pq.size());
		
	}

}
