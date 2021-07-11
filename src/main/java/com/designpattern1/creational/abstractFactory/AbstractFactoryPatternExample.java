package com.designpattern1.creational.abstractFactory;

import java.io.*;

class AbstractFactoryPatternExample {
	public static void main(String args[]) throws IOException {

		String bankName = "HSBC";
		String loanName = "business";

		AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
		Bank b = bankFactory.getBank(bankName);

		System.out.print("Enter the interest rate for " + b.getBankName() + ": ");

		double rate = 12;
		double loanAmount = 15000;
		System.out.println("Enter the loan amount : "+loanAmount);
		int years = 2;
		System.out.println("year=="+years);

		System.out.println("you are taking the loan from " + b.getBankName());

		AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
		Loan l = loanFactory.getLoan(loanName);
		l.getInterestRate(rate);
		l.calculateLoanPayment(loanAmount, years);
	}
}// End of the AbstractFactoryPatternExample
