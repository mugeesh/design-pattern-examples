package com.designpattern3.behavioral.mediator;

import java.util.ArrayList;

public class StockMediator implements Mediator {

	private ArrayList<Colleague> colleagues;
	private ArrayList<StockOffer> stockBuyOffers;
	private ArrayList<StockOffer> stockSellOffers;

	private int colleagueCodes = 0;

	public StockMediator() {
		this.colleagues = new ArrayList<Colleague>();
		this.stockBuyOffers = new ArrayList<StockOffer>();
		this.stockSellOffers = new ArrayList<StockOffer>();
	}

	@Override
	public void addColleague(Colleague newColleague) {
		colleagues.add(newColleague);
		colleagueCodes++;
		newColleague.setColleagueCode(colleagueCodes);
	}

	@Override
	public void saleOffer(String stock, int shares, int colleagueCode) {

	}

	@Override
	public void buyOffer(String stock, int shares, int colleagueCode) {

	}

}
