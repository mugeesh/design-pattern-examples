package com.designpattern1.creational.builder;
// Defines the methods needed for creating parts 

// for the House
interface HouseBuilder {

	public void buildBasement();

	public void buildStructure();

	public void bulidRoof();

	public void buildInterior();

	public House getHouse();
}
