package com.designpattern2.structural.proxy;
// In this situation the proxy both creates and destroys

// an ATMMachine Object

public class ATMProxy implements GetATMData {

	@Override
	public ATMState getATMData() {
		ATMMachine realATMMachine = new ATMMachine();
		return realATMMachine.getATMData();
	}

	@Override
	public int getCashInMachine() {
		ATMMachine realATMMachine = new ATMMachine();
		return realATMMachine.getCashInMachine();
	}

}
