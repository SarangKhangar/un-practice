package com.DSA.patterns;

public class DigonalPattern {
	
	public static void main(String[] args) {
		printDigonalStar(5);
	}

	public static void printDigonalStar(int num) {
		
		for (int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
}
