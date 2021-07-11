package com.designpattern2.structural.decorator;

abstract class ToppingDecorator implements Pizza {
    protected Pizza tempPizza;
  
    public ToppingDecorator(Pizza pizza) {
    	tempPizza=pizza;
    }

	@Override
	public String getDescription() {
		return tempPizza.getDescription();
	}

	@Override
	public double getCost() {
		return tempPizza.getCost();
	}
   
}
