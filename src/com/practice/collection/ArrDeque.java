package com.practice.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrDeque {

	public static void main(String[] args) {

		// sorted
		// additional feature function added
		//using pop u can remove front elemet
		//using  push can add element at front
		//using peek and peek first return the first smallest
		//peekLast return the last element
		//poll pollFirst remove the first smallest
		//pollLast remove the last element
		//offerFirst add element in front
		//offer, offerLast add element at last
		//another method
		//Deque<Integer> dq = new ArrayDeque<>()
		//getFirst and GetLast to get first nd last
;		ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(6);
		ad.add(1);
		ad.add(3);
		ad.add(4);
		ad.add(5);
		ad.add(2);

//		System.out.println(ad.size());
//
//		System.out.println(ad.offer(11));
//
//		for (int i : ad) {
//			System.out.println(i);
//		}

		//System.out.println(ad.size());

//		System.out.println((ad.offerFirst(10)));
//
//		System.out.println((ad.offerLast(10)));
//
//		for (int i : ad) {
//			System.out.println(i);
//		}
//
//		System.out.println(ad.peek());
//
//		System.out.println(ad.peekLast());
//
//		System.out.println(ad.poll());
//		
//		System.out.println(ad.pollLast());
//		
		System.out.println(ad.pop());
//		
//		ad.push(8);
//
		System.out.println(ad.size());
//
		for (int i : ad) {
			System.out.println(i);
		}
//		
//		System.out.println(ad.getFirst());
//		
//		System.out.println(ad.getFirst());
//

	}

}
