package com.designpattern2.structural.facade;

public class AccountNumberCheck {
	private int accountNumber = 123456789;

	public int getAccountNumber() {
		return accountNumber;
	}

public boolean accountActive (int accNumToCheck) {
	if(accNumToCheck ==getAccountNumber()) {
		return true;
	}
	else {
		return false;
	}
}

}
