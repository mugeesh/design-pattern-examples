package com.designpattern1.creational.factory.builder;
// The concrete builder class that assembles the parts 
// of the finished Robot object

public class OldHouseBuilder implements HouseBuilder {

	private House house;
	
	public OldHouseBuilder() {
		this.house = new House();
	}

	@Override
	public House getHouse() {
		return this.house;
	}

	@Override
	public void buildBasement() {
		house.setBasement("wooden basement");		
	}

	@Override
	public void buildDoor() {
		house.setHouseDoor("Build door");		
	}

	@Override
	public void buildWindows() {
		house.setHouseWindows("Build windows");		
	}

	@Override
	public void buildRoof() {
        house.setHouseRoof("Ice Dome");
	}

	@Override
	public void buildSwimmingPool() {
		house.setHousePool("No Pool");		
	}

	
	
}