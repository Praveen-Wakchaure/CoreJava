package com.cg.lab8;

public class Exercise2 implements Runnable{

	@Override
	public void run() {

		int i = 0;
		while(true) {
			System.out.println(i);
			i++;
			if(i == 10) i = 0;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Thread obj = new Thread(new Exercise2());
		obj.start();
	}

	
}