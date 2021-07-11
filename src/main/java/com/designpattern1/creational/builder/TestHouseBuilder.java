package com.designpattern1.creational.builder;

public class TestHouseBuilder {

	//implemented 
	//https://refactoring.guru/design-patterns/builder
	//https://www.youtube.com/watch?v=9XnsOpjclUg&list=PLF206E906175C7E07&index=8
	//for read only
	//https://www.geeksforgeeks.org/builder-design-pattern/
	
	
	public static void main(String[] args) {

		// Get a HouseBuilder of type OldHouseBuilder

		HouseBuilder oldStyleHouse = new OldHouseBuilder();

		// Pass the OldHouseBuilder specification to the engineer

		CivilEngineer civilEngineer = new CivilEngineer(oldStyleHouse);

		// Tell the engineer to make the House using the specifications
		// of the OldHouseBuilder class

		civilEngineer.buildHouse();

		// The engineer returns the right House based off of the spec
		House firstHouse = civilEngineer.gethoHouse();

		System.out.println("House Built for ---::old style");
		System.out.println("House Swimming Pool: " + firstHouse.getPool());
		System.out.println("House Walls " + firstHouse.getBasement());
		System.out.println("House Door " + firstHouse.getHouseDoor());
		System.out.println("House roof: " + firstHouse.getHouseRoof());
		System.out.println("House Windows: " + firstHouse.getHouseWindows());
		System.out.println("---end of old style house----");
		
		System.out.println("House Built with swimming pool");
		
		HouseWithSwimmingPoolBuilder modernHouse = new HouseWithSwimmingPoolBuilder();
		civilEngineer = new CivilEngineer(modernHouse);
		civilEngineer.buildHouse();
		firstHouse = civilEngineer.gethoHouse();


		// Tell the engineer to make the House using the specifications
		// of the OldHouseBuilder class

		System.out.println("House Swimming Pool: " + firstHouse.getPool());
		System.out.println("House Walls " + firstHouse.getBasement());
		System.out.println("House Door " + firstHouse.getHouseDoor());
		System.out.println("House roof: " + firstHouse.getHouseRoof());
		System.out.println("House Windows: " + firstHouse.getHouseWindows());

	}

}