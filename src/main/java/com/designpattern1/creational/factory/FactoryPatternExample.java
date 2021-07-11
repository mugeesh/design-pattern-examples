package com.designpattern1.creational.factory;

import java.io.IOException;

public class FactoryPatternExample {
	public static void main(String args[]) throws IOException {

		GetLogisticPlanFactory logisticPlanFactory = new GetLogisticPlanFactory();

		// System.out.print("Enter the name of plan :: ");
		String planName = "sea";
		int units = 10;

		System.out.println("Plan Name=" + planName + " units :" + units);

		Logstics p = logisticPlanFactory.getPlan(planName);

		// System.out.println("amount for :: " + planName + " of " + units + " units is:
		// ");

		Transport t = p.createTransport();
		// t.deliverty();
		int rate = t.getRate();
		int amount = t.transpotationCost(units, rate);
		System.out
				.println("Final Cost of transpotation by ::=" + p.planDelivry() + " is ::" + amount + " rate :" + rate);

		planName = "road";
		units = 10;
		System.out.println("Plan Name=" + planName + " units :" + units);

		p = logisticPlanFactory.getPlan(planName); // get the factory methid

		t = p.createTransport();
		// t.deliverty();
		rate = t.getRate();
		amount = t.transpotationCost(units, rate);
		System.out
				.println("Final Cost of transpotation by ::=" + p.planDelivry() + " is ::" + amount + " rate :" + rate);

	}
}// end of GenerateBill class.
