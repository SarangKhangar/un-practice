package com.DSA.patterns;

public class RigthTriangle {
	
	public static void main(String[] args) {
		printRigthTriangle(5 );
		reverseRigthTriangle(5);
	}
	
	public static void printRigthTriangle(int num) {
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public static void reverseRigthTriangle(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
