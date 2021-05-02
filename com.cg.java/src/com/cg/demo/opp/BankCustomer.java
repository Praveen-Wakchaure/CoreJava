package com.cg.demo.opp;

public class BankCustomer {
	// non static (fields and methods) - restricted access (object reference)
		// static (fields and methods) - free access (class reference)



		static int bankPhone;
		static String ifsc;
		int acNo;
		String name;
		double balance;
		long phone;

		// 1. complete the following code 

		void withdraw() {
			System.out.println("withdraw");
		}
		void transfer() {
			System.out.println("transfer");
		}
		void checkBalance() {
			System.out.println("checkBalance");
		}
		static void deposit() {
			System.out.println("deposit");
		}
		static void openAccount() {
			System.out.println("openAccount");
		}
	}


