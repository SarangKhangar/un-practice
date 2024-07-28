package com.practice.collection;

import java.util.HashMap;
import java.util.Hashtable;

public class TestHashMap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> names = new HashMap<>();
		names.put(1, "Sarang");
		System.out.println(names.size());
		System.out.println(names);
		
		Hashtable<Integer, String> namesTwo = new Hashtable<>();
		namesTwo.put(1, "Sarsng");
		System.out.println(namesTwo.size());
		
	}

}
