package com.designpattern1.creational.factory;


interface Transport {
	void deliverty();

	int getRate();

	int transpotationCost(int units, int rate);

	//default int transpotationCost(int units) {
	//	return units * rate;
	//}
}
//	abstract public void deliverty();
//
//	protected int rate;
//
//	abstract void getRate();
//
//	public int transpotationCost(int units) {
//		return units * rate;
//	}
//}