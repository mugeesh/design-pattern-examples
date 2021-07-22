package com.designpattern3.behavioral.mediator;

public abstract class Colleague {
	private Mediator mediator;
	private int colleagueCode = 0;

	public Colleague(Mediator mediator, int colleagueCode) {
		super();
		this.mediator = mediator;
		this.colleagueCode = colleagueCode;
	}
	
	public void saleOffer(String stock, int shares) {
		mediator.saleOffer(stock,shares,this.colleagueCode);
	}
	public void buyOffer(String stock, int shares) {
		mediator.buyOffer(stock,shares,this.colleagueCode);
	}

	public void setColleagueCode(int colleagueCode) {
		this.colleagueCode = colleagueCode;
	}
	
}

