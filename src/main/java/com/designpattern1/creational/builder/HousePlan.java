package com.designpattern1.creational.builder;

//This is the interface that will be returned from the builder
interface HousePlan {
	public void setBasement(String basement);

	public void setStructure(String structure);

	public void setRoof(String roof);

	public void setInterior(String interior);
}