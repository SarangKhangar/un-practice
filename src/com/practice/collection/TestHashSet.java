package com.practice.collection;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	
	public static void main(String[] args) {
		
		//not sorted 
		//contains unique elements duplicates are not allowed
		Set<Integer> s = new HashSet<>();
		
		s.add(1);
		s.add(5);
		s.add(4);
		s.add(2);
		s.add(3);
		
		System.out.println(" " + s.size());
		
		for(int i : s) {
			System.out.println(i);
		}
		
		System.out.println(s.hashCode());
		System.out.println(s);
		
	}

}
