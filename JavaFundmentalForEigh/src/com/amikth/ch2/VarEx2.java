package com.amikth.ch2;

public class VarEx2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int temp = 0;
		
		System.out.println("x: " + x + " y:" +y );
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x: " + x + " y:" +y );
	}
}
