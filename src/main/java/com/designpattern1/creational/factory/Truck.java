package com.designpattern1.creational.factory;


public class Truck implements Transport {

	public void deliverty() {
		System.out.println("delivery Mode is::  by Truck");
	}

	//int rate=10;
	
	@Override
	public int getRate() {
		return 10;
	}
	
	public int transpotationCost(int units, int rate) {
		return units * rate;
	}


}
