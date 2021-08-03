package com.designpattern3.behavioral.template;

//theory :https://www.youtube.com/watch?v=aR1B8MlwbRI&list=PLF206E906175C7E07&index=16

//example: https://www.journaldev.com/1763/template-method-design-pattern-in-java/

public class HousingClient {

	public static void main(String[] args) {

		HouseTemplate houseType = new WoodenHouse();

		// using template method
		houseType.buildHouse();
		System.out.println("************");

		houseType = new GlassHouse();

		houseType.buildHouse();
	}

}
