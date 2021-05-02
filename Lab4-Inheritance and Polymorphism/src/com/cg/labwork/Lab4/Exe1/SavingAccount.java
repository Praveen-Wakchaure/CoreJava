package com.cg.labwork.Lab4.Exe1;

public class SavingAccount {
	final long MINIMUM_BALANCE = 500;	
	@Override
	public void withdraw(double amount) {
		if((this.getBalance() - amount) > MINIMUM_BALANCE)
			this.setBalance(this.getBalance()-amount);
		else
			System.out.println("No transaction possible for account " + this.getAccNum());
	}
	

}
