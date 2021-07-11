package com.designpattern2.structural.decorator;

public class Mozzarella extends ToppingDecorator{

	public Mozzarella(Pizza pizza) {
		super(pizza);
	}
	@Override
	public String getDescription() {
        return tempPizza.getDescription() + ", mozzarella";
	}

	@Override
	public double getCost() {
		System.out.println("Cost of mozzarella: " + 5.00);
		return tempPizza.getCost()+ 5;
	}
	 
}

