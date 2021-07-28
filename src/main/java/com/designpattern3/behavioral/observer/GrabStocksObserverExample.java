package com.designpattern3.behavioral.observer;

//https://www.youtube.com/watch?v=jOnxYT8Iaoo&list=PLF206E906175C7E07&index=25&ab_channel=DerekBanas

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
		StockGrabber stockGrabber=new StockGrabber();
		
		StockObserver observer1=new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setApplePrice(677.00);
		stockGrabber.setGooglePrice(676.00);
		
		stockGrabber.unregister(observer1);
		
		//StockObserver observer2=new StockObserver(stockGrabber);
	}

}
