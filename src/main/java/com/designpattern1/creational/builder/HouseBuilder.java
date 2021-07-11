package com.designpattern1.creational.builder;
// Defines the methods needed for creating parts 

// for the House

public interface HouseBuilder {

	public void buildBasement();

	public void buildDoor();

	public void buildWindows();

	public void buildRoof();

	public House getHouse();
	
	public void buildSwimmingPool();
	

}