package com.cg.lab6;

import java.util.Arrays;

public class Exercise5 {
	
	public static int getSecondSmallest(int[] arr)
	{
		Arrays.sort(arr);
		return arr[1];
	}
	
	public static void main(String[] args) {
		int [] arr = {45,12,10,45,1,2};
		int num = getSecondSmallest(arr);
		System.out.println("Second smallest number: "+ num);
	}

}
