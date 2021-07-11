package com.designpattern2.structural.facade;

public class SecurityCodeCheck {

	private int securityCode = 1234;

	public int getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}

	public boolean isCodeCorrect(int securityCode) {
		if (securityCode == getSecurityCode()) {
			return true;
		} else {
			return false;
		}
	}

}
