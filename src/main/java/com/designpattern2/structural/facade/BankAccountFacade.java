package com.designpattern2.structural.facade;

public class BankAccountFacade {

	private int accountNumber;
	private int securityCode;

	AccountNumberCheck accountCheck;
	SecurityCodeCheck codeChecker;
	FundsCheck fundChecker;

	WelcomeToBank bankWelcome;

	public BankAccountFacade(int newAccNum, int newSecorityCode) {
		accountNumber = newAccNum;
		securityCode = newSecorityCode;

		bankWelcome = new WelcomeToBank();
		accountCheck = new AccountNumberCheck();
		codeChecker = new SecurityCodeCheck();
		fundChecker = new FundsCheck();

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getSecurityCode() {
		return securityCode;
	}

	public void withDrawCash(double cashToGet) {
		if (accountCheck.accountActive(getAccountNumber()) && codeChecker.isCodeCorrect(getSecurityCode())
				&& fundChecker.haveEnoughMoney(cashToGet)) {
			System.out.println("Transaction complete\n");
		}else {
			System.out.println("Transaction Failed\n");
		}
	}
	
	public void depositeCash(double cashToDeposit) {
		if (accountCheck.accountActive(getAccountNumber())
				&& codeChecker.isCodeCorrect(getSecurityCode())){
			fundChecker.makeDeposit(cashToDeposit);
			System.out.println("Transaction complete\n");
		}else {
			System.out.println("Transaction Failed\n");
		}
	
	}

}
