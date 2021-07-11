package com.designpattern1.creational.builder;

//This is the interface that will be returned from the builder

public interface HousePlan {
	public void setBasement(String basement);

	public void setHouseDoor(String door);

	public void setHouseWindows(String windows);

	public void setHouseRoof(String roof);
	public void setHousePool(String roof);

}
