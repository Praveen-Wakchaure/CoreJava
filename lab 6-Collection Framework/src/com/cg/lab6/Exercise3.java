package com.cg.lab6;

import java.util.HashMap;
import java.util.Iterator;

public class Exercise3 {
	
	public static HashMap<Integer, Integer> getSquares(int[] arr)
	{
		HashMap<Integer, Integer> sqr = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			sqr.put(arr[i], arr[i]*arr[i]);
		}
		return sqr;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2,4,5,6};
		HashMap<Integer, Integer> sal = getSquares(arr);
		System.out.println(sal);
	}
}
