package com.DSA.patterns;

public class SquarePattern {
	
	public static void main(String[] args) {
		hallowSquare(5);
		printSquareInAlphaRep(5);
		printSquareInAlphaTillZ(5);
		printSquareInNum(5);
		printSquareInStar(5);
	}
	
	public static void printSquareInNum(int size) {
		for(int row=0; row<size; row++) {
			for(int column=0; column<size; column++) {
				System.out.print(row + " " );
			}
			System.out.println();
		}
	}
	
	public static void printSquareInStar(int size) {
		for(int row=0; row<size; row++) {
			for(int column=0; column<size; column++) {
				System.out.print("* " );
			}
			System.out.println();
		}
	}
	
	public static void printSquareInAlphaTillZ(int size) {
		char ch = 'A';
		for(int row=0; row<size; row++) {
			for(int column=0; column<size; column++) {
				System.out.print(ch);
				ch = (char)(ch+1);
			}
			System.out.println();
		}
	}
	
	public static void printSquareInAlphaRep(int size) {
		char ch = 'A';
		for(int row=0; row<size; row++) {
			for(int column=0; column<size; column++) {
				System.out.print(ch);
				ch = (char)(ch+1);
			}
			ch='A';
			System.out.println();
		}
	}
	
	public static void hallowSquare(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0 || j==0 || i==n-1 || j==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
