package com.cg.demo.basic;

public class App {
	
	void m1() {
		System.out.println("m1");
	}
	
	public static void main(String[] args) {
		
		App app = new App();
		app.m1();
		
		Employee emp = new  Employee(101, "Sonu", 20.50);
		Employee emp = new  Employee(101, "Sonu", 20.50);
		
		System.out.println(emp.toString());
		
	}
	}