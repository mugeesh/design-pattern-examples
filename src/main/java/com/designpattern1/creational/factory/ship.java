package com.designpattern1.creational.factory;


public class ship implements Transport {

	public void deliverty() {
		System.out.println("delivery Mode is::  by Ship");
	}

	@Override
	public int getRate() {
		return 30;
	}
	
	public int transpotationCost(int units, int rate) {
		return units * rate;
	}

}
