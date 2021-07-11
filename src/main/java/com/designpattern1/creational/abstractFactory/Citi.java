package com.designpattern1.creational.abstractFactory;

public class Citi implements Bank {
	private final String BNAME;

	public Citi() {
		BNAME = "Citi BANK";
	}

	public String getBankName() {
		return BNAME;
	}
}
