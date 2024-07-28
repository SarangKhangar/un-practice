package com.DSA;

public class SortArray {
	
	public static void main(String[] args) {
		
		int[] intArray = {4, 5, 3, 6, 4, 8, 7, 0 ,9, 45, 12 , 45 , 65};
		
		for(int i=0; i<13; i++) {
			for(int j=0; j<13; j++) {
				if(intArray[i]<intArray[j]) {
					int temp = intArray[i];
					intArray[i]=intArray[j];
					intArray[j]=temp;
				}
			}
		}
		
		for(int a : intArray) {
			System.out.println(a);
		}
		
	}

}
