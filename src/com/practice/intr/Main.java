package com.practice.intr;

public class Main {
	
	public static void main(String[] args) {
		try {
			int a = 5/0;
		}
		catch(Exception e){
			//e.printStackTrace();
		}
//		finally {
//			System.out.println("I am there");
//		}
		
		System.out.println("I am there");
		
	}

}
