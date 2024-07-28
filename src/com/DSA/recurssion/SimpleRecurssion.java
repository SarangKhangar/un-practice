package com.DSA.recurssion;

public class SimpleRecurssion {
	
	int num = 5;
	
	public static void main(String[] args) {
		SimpleRecurssion sr = new SimpleRecurssion();
		//sr.recurssion();
		r2(5);
	}
	
	public  void recurssion() {
		if(num>0) {
			System.out.println(num);
			num--;
			//System.out.println(num);
			recurssion();
			//System.out.println(num);
		}
		//System.out.println(num);//gives most updated recenlty updated recently changed value
	}
	
	public static void r2(int num) {
		if(num==0) return;
		System.out.println(num);//this will give 54321 reverse order
		r2(num-1);
		System.out.println(num);//this will give 12345 ascending order
	}

}
