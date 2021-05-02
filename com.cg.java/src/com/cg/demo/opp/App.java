package com.cg.demo.opp;

public class App {
	
	public static void main(String[] args) {
		System.out.println("Start");


		// 2. create two objects of BankCustomer and call all the methods appropriately.
		
		BankCustomer b1 = new BankCustomer();
		
		//non-static method
		
		b1.withdraw();
		b1.transfer();
		b1.checkBalance();
		
		//static methods
		
		BankCustomer.deposit();
		BankCustomer.openAccount();
		

	}
		
	}
	


