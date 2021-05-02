package com.cg.demo.pc;

import java.util.*;

public class SumDigitCube {
	
	public static void main(String s[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number:");
		int a = sc.nextInt();
		int sum = 0,n;
		while(a!=0)
		{
			n = a%10;
			sum = sum + (n*n*n);
			a = a/10;
			
		}
		System.out.println(sum);
	}

}
