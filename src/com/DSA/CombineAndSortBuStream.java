package com.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CombineAndSortBuStream {
	
	public static void main(String[] args) {
		
		Integer[] a = {2,3,6,7,9};
		Integer[] b = {1,4,8,5,10};
		
		Integer[] c = Stream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray(Integer[]::new);
		
		for(Integer i : c) {
			System.out.println(i);
		}
		
	}

}
