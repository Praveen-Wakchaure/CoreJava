package com.cg.lab6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exercise4 {
	
	public static HashMap<Integer, String> getStugents(HashMap<Integer, Integer> stud)
	{
		HashMap<Integer, String> grade = new HashMap<>();
		Iterator<Map.Entry<Integer, Integer>> itr = stud.entrySet().iterator(); 
        
        while(itr.hasNext()) 
        { 
             Map.Entry<Integer, Integer> entry = itr.next(); 
             if(entry.getValue()>80)
            	 grade.put(entry.getKey(), "Gold");
             
             else if (entry.getValue()>=80 && entry.getValue()<=90) {
            	 grade.put(entry.getKey(), "Silver");
			}
             else if (entry.getValue()>=70 && entry.getValue()<80) {
            	 grade.put(entry.getKey(), "Silver");
			}
//             System.out.println("Key = " + entry.getKey() +  
//                                 ", Value = " + entry.getValue()); 
             
        } 
        
		return grade;
	}
	
	public static void main(String[] args) {
		HashMap< Integer, Integer> stud = new HashMap<Integer, Integer>();
		stud.put(101, 98);
		stud.put(102, 80);
		stud.put(103, 70);
		stud.put(104, 75);
		stud.put(105, 90);
		
		HashMap<Integer, String> grades =  getStugents(stud);
		System.out.println(grades);
	}
}
