package com.cg.labwork.Lab4.Exe1;

public class CurrentAccount {
	final int OVER_DRAFT_LIMIT  = 1000;
	@Override
	public void withdraw(double amount) {
		if((this.getBalance() - amount) > OVER_DRAFT_LIMIT)
			this.setBalance(this.getBalance()-amount);
		else
			System.out.println("No transaction possible for account " + this.getAccNum());
	}

}
