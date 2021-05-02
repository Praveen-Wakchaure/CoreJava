package com.cg.demo.basic;

public class CastingDemo {
	
	public static void main(String[] args) {
		
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte) (b1 + b2);
		
		System.out.println(b3);
		
		Object obj = new CastingDemo();    //
		
		CastingDemo obj2 = (CastingDemo) obj;
		
		int i1 = 127;
		byte b4 = (byte) i1;
		System.out.println(b4);
		
		int i2 = b4;
		 double num2 = 12.5;
		 
		 int num3 = (int) (num2); // Casting
		
		  System.out.println(num3);
		
		
		
	}

}
