package com.designpattern1.creational.factory;


public class RoadLogstics extends Logstics {

	@Override
	String planDelivry() {
		//Transport t=createTransport();
		return "road";
	}

	@Override
	Transport createTransport() {
		return new Truck();
	}

}
