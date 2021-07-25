package com.designpattern3.behavioral.mediator;

//https://www.youtube.com/watch?v=8DxIpdKd41A&list=PLF206E906175C7E07&index=24

/* Mediator Design pattern is handle to communicate between related object (colleagues)
 * All communication handle by Mediator pattern and colleagues don't need to know anything about the communication.
 * The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object
 * Allow Loose coupling b/w objects.
 * It decouples the number of classes.
 * It simplifies object protocols.
 * It centralizes the control.
 */

public class TestStockMediatorExample {

	public static void main(String[] args) {
		StockMediator nyse=new StockMediator();
		
		GormanSlacks broker =new GormanSlacks(nyse);
		JTPoorman broker2=new JTPoorman(nyse);
		
		broker.saleOffer("MicroSoft", 100);
		broker.saleOffer("GOOGLE", 50);
		
		broker2.buyOffer("MicroSoft", 100);
		
		broker2.saleOffer("HSBC", 10);

		broker2.buyOffer("HSBC", 10);
		
		broker2.saleOffer("LalaMove", 10);
		
		//broker2.buyOffer("Fleet", 100);

		nyse.getStockOfferings();
	}

}
