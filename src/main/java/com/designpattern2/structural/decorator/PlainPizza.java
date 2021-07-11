package com.designpattern2.structural.decorator;

//Implements the Pizza interface with only the required
//methods from the interface

//Every Pizza made will start as a PlainPizza

public class PlainPizza implements Pizza {

	public String getDescription() {
		return "Thin dough";
	}
	public double getCost() {
		System.out.println("Cost of Dough: " + 5.00);
		return 5.00;
	}

}
