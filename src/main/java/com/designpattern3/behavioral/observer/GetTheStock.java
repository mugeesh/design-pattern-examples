package com.designpattern3.behavioral.observer;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {

	private int starteTime;
	private String stock;
	private double price;

	private Subject stockGrabber;

	public GetTheStock(Subject stockGrabber, int newStartTime, String newStock, double newPrice) {
		this.stockGrabber = stockGrabber;

		starteTime = newStartTime;
		stock = newStock;
		price = newPrice;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			try {
				// Sleep for 2 seconds
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            // Generates a random number between -.03 and .03
			double randNum = (Math.random() * (.06)) - .03;
			DecimalFormat df = new DecimalFormat("#.##");
			price = Double.valueOf(df.format((price + randNum)));

			if (stock == "IBM")
				((StockGrabber) stockGrabber).setIBMPrice(price);
			if (stock == "APPLE")
				((StockGrabber) stockGrabber).setApplePrice(price);
			if (stock == "Google")
				((StockGrabber) stockGrabber).setGooglePrice(price);

			System.out.println("Updated :: "+stock + " : " + df.format((price + randNum)) + " " + df.format(randNum));

		}

	}
}
