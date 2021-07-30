package com.designpattern3.behavioral.observer;

//https://www.youtube.com/watch?v=wiQdrH2YpT4&list=PLF206E906175C7E07&index=4

/*
Observer is a behaviour design pattern that lets you define a subscription mechanism to notify multiple objects 
about any events that happen to the object they’re observing. ::refactoring.guru
 */
/*
 * When we need many objects to receive an update when another object changes.
 * Stock market: with thousands of stocks need to send to update to objects representing individual socks.
 * The Subject (Publisher) sends many stocks to the Observers
 * The Observers(subscribers) takes the one they want and use them. 
 */

/*
 * Benifit :
 * *Loose coupling (subject/publisher doen't need to know  anything about the observers(subscribers)
 * Negatives: The SUbject(Publisher) may send updates that don't matter to the observer(subscriber) 
 */

public class GrabStocksObserverExample {

	public static void main(String[] args) {
		StockGrabber stockGrabber = new StockGrabber();

		StockObserver observer1 = new StockObserver(stockGrabber);

		stockGrabber.setIBMPrice(200.00);
		stockGrabber.setApplePrice(201.00);
		stockGrabber.setGooglePrice(202.00);

		//stockGrabber.setIBMPrice(800.00);

        // Delete one of the observers
		//stockGrabber.unregister(observer1);

		StockObserver observer2 = new StockObserver(stockGrabber);

		stockGrabber.setIBMPrice(300.00);
		stockGrabber.setApplePrice(301.60);
		stockGrabber.setGooglePrice(302.40);

        // Delete one of the observers
        // stockGrabber.unregister(observer2);
         
        stockGrabber.setIBMPrice(400.00);
        stockGrabber.setApplePrice(401.60);
        stockGrabber.setGooglePrice(402.00);
         


	}

}
