package com.designpattern1.creational.builder;
// The concrete builder class that assembles the parts 
// of the finished Robot object

public class HouseWithSwimmingPoolBuilder implements ModernHouseBuilder {

	private House house;
	
	public HouseWithSwimmingPoolBuilder() {
		this.house = new House();
	}

	@Override
	public House getHouse() {
		return this.house;
	}

	@Override
	public void buildBasement() {
        house.setBasement("Ice Bars");
	}
	

	@Override
	public void buildDoor() {
		house.setHouseDoor("stylus door");		
	}

	@Override
	public void buildWindows() {
		house.setHouseWindows("stylus windows");		
	}

	@Override
	public void buildRoof() {
		house.setHouseRoof("stylus roof");		
	}
	@Override	
	public void buildSwimmingPool() {
		house.setHousePool("stylus Swimming Pool");		
	}
	
}