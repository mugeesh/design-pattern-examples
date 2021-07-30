package com.designpattern3.behavioral.observer;

public class StockObserver implements Observer {

	private double ibmPrice;
	private double applePrice;
	private double googlePrice;

	private static int observerIDTracker = 0;

	// Used to track the observers

	private int observerID;

	// Will hold reference to the StockGrabber object
	private Subject stockGrabber;

	public StockObserver(Subject stockGrabber) {

		// Store the reference to the stockGrabber object so
		// I can make calls to its methods
		this.stockGrabber = stockGrabber;

		// Assign an observer ID and increment the static counter
		this.observerID = ++observerIDTracker;

		// Message notifies user of new observer

		System.out.println("New Observer " + this.observerID);

		// Add the observer to the Subjects ArrayList

		stockGrabber.register(this);

	}

	// Called to update all observers

	@Override
	public void update(double ibmPrice, double applePrice, double googlePrice) {
		this.ibmPrice = ibmPrice;
		this.applePrice = applePrice;
		this.googlePrice = googlePrice;

		printThePrices();
	}

	public void printThePrices() {
		System.out.println(
				observerID + "\nIBM: " + ibmPrice + "\nAPPLE: " + applePrice + "\nGoogle: " + googlePrice + "\n");
	}

}
