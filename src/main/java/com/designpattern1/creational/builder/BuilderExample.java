package com.designpattern1.creational.builder;

/*
 * Builder Pattern says that "construct a complex object from simple objects using step-by-step approach"

 */
public class BuilderExample {

	// implemented
	// https://refactoring.guru/design-patterns/builder
	// https://www.youtube.com/watch?v=9XnsOpjclUg&list=PLF206E906175C7E07&index=8
	// for read only
	// https://www.geeksforgeeks.org/builder-design-pattern/
	public static void main(String[] args) {

		HouseBuilder iglooBuilder = new IglooHouseBuilder();
		CivilEngineer engineer = new CivilEngineer(iglooBuilder);

		engineer.buildHouse();

		House house = engineer.getHouse();

		System.out.println("Builder constructed: " + house);

		System.out.println("----TIPI House----");
		HouseBuilder tipiBuilder = new TipiHouseBuilder();
		engineer = new CivilEngineer(tipiBuilder);
		engineer.buildHouse();

		house = engineer.getHouse();

		System.out.println("Builder constructed: " + house);
	}
}
