package com.cg.lab6;

import java.util.Arrays;

public class Excercise7 {
	
	public static int[] getSoted(int arr[])
	{
		String str[] = new String[arr.length];
		String str1[] = new String[arr.length];
		int arr1 [] = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			str[i]= Integer.toString(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			String em="";
			for(int j=str[i].length()-1;j>=0;j--)
			{
				em=em+str[i].charAt(j);
				
			}
			str1[i]=em;
		}
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]= Integer.parseInt(str1[i]);
			
		}
		Arrays.sort(arr1);
		return arr1;
		
		
	}
	
	public static void main(String[] args) {
		int arr[] = {25,87,62,12,10};
		int ans[] =  getSoted(arr);
		for(int i=0;i<ans.length;i++)
			System.out.println(ans[i]);
	}
}
