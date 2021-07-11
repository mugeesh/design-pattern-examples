package com.designpattern2.structural.facade;

public class FundsCheck {

	private double cashInAccount = 1000.00;

	public double getCashInAccount() {
		return cashInAccount;
	}

	public void descreaseCashInAccount(double cashWithdraw) {
		cashInAccount -= cashWithdraw;
	}

	public void increaseCashInAccount(double cashDeposited) {
		cashInAccount += cashDeposited;
	}

	public boolean haveEnoughMoney(double cashToWithdraw) {

		if (cashToWithdraw > getCashInAccount()) {
			System.out.println("Erro: you don't have enough money");
			System.out.println("Current Balance:" + getCashInAccount());
			return false;
		} else {
			descreaseCashInAccount(cashToWithdraw);
			System.out.println("Withdraw complete: Current balance is:" + getCashInAccount());
			return true;
		}

	}
	
	public void makeDeposit(double cashToDeposit) {
		increaseCashInAccount(cashToDeposit);
		System.out.println("Deposute completed : current balance:"+getCashInAccount());
		
	}
}
