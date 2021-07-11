package com.designpattern1.creational.factory.builder;
// The director / engineer class creates a Robot using the
// builder interface that is defined (OldRobotBuilder)

public class CivilEngineer {
	
	private HouseBuilder houseBuilder;
	
	// OldHouseBuilder specification is sent to the civil engineer
	
	public CivilEngineer(HouseBuilder houseBuilder){
		this.houseBuilder = houseBuilder;
	}
	
	// Return the Robot made from the OldHouseBuilder spec
	
	public House gethoHouse(){
		return this.houseBuilder.getHouse();
		
	}
	
	// Execute the methods specific to the RobotBuilder 
	// that implements houseBuilder (OldHouseBuilder)
	
	public void buildHouse() {
		this.houseBuilder.buildBasement();
		this.houseBuilder.buildDoor();
		this.houseBuilder.buildRoof();
		this.houseBuilder.buildWindows();
		this.houseBuilder.buildSwimmingPool();
	}
	
}