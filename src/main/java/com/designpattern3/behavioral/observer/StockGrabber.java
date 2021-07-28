package com.designpattern3.behavioral.observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observes;

	private double ibmPrice;
	private double applePrice;
	private double googlePrice;

	public StockGrabber() {
		observes = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer newObserver) {
		observes.add(newObserver);
	}

	@Override
	public void unregister(Observer deleteObserver) {
		int observerIndex = observes.indexOf(deleteObserver);

		System.out.println("Observer " + (observerIndex + 1) + " deleted");
		observes.remove(observerIndex);

	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observes) {
			observer.update(ibmPrice, applePrice, googlePrice);
		}
	}

	public void setIBMPrice(double newIBMPrice) {
		this.ibmPrice = newIBMPrice;
		notifyObserver();
	}

	public void setApplePrice(double newApplePrice) {
		this.applePrice = newApplePrice;
		notifyObserver();
	}
	public void setGooglePrice(double newGooglePrice) {
		this.googlePrice = newGooglePrice;
		notifyObserver();
	}
}
