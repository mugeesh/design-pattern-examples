package com.designpattern2.structural.decorator;


public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding Sauce");
	}

	@Override
	public String getDescription() {
        return tempPizza.getDescription() + ", tomato sauce";
	}

	@Override
	public double getCost() {
		System.out.println("Cost of Sauce: " + 1.5);
		return tempPizza.getCost()+ 1.5; //hkd
	}

}
