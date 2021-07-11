package com.designpattern2.structural.facade;

//reference : https://www.youtube.com/watch?v=B1Y8fcYrz5o&list=PLF206E906175C7E07&index=14

public class TestBankAccount {
	public static void main(String[] args) {
		BankAccountFacade accessingBank = new BankAccountFacade(123456789, 1234);

		accessingBank.withDrawCash(50.0);

		accessingBank.withDrawCash(900.0);
		
		accessingBank.depositeCash(200.0);
	}
}
