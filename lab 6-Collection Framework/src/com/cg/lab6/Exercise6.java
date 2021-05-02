package com.cg.lab6;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercise6 {
	
	public static ArrayList<Integer> votersList(Map<Integer, Integer> voteList)
	{
		ArrayList<Integer> validList = new ArrayList<Integer>();
		
		for(int i : voteList.values())
		{
			if(i>18)
				validList.add(i);
				
		}
		return validList;
	}

	public static void main(String[] args) {
		Map<Integer, Integer> voteList = new HashMap<Integer, Integer>();
		voteList.put(101, 21);
		voteList.put(102, 17);
		voteList.put(103, 22); 
		
		ArrayList<Integer> list = votersList(voteList);
		System.out.println(list);
		
	}
}

