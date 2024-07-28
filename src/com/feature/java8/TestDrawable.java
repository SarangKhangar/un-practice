package com.feature.java8;

public class TestDrawable{
	
	public static void main(String[] args) {
	
		  Drawable d2 = (a, b)-> {return a+b;};
		  //System.out.println(d2);
	      System.out.println(d2.draw(5, 5));
		}
}

interface Drawable{
	public int draw(int a, int b);
}
