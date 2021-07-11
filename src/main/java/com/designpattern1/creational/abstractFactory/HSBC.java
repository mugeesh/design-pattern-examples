package com.designpattern1.creational.abstractFactory;

public class HSBC implements Bank {
	private final String BNAME;

	public HSBC() {
		BNAME = "HSBC BANK";
	}

	public String getBankName() {
		return BNAME;
	}
}
