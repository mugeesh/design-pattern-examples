package com.designpattern1.creational.factory;

public class SeaLogstics extends Logstics {

	@Override
	String planDelivry() {
		return "sea";
	}

	@Override
	Transport createTransport() {
		return new ship();
	}

}
