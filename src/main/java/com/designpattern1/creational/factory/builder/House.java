package com.designpattern1.creational.factory.builder;

//The concrete House class based on the HousePlan interface


//https://refactoring.guru/design-patterns/builder
//https://www.youtube.com/watch?v=9XnsOpjclUg&list=PLF206E906175C7E07&index=8
public class House implements HousePlan {

	
	private String door;
	private String windows;
	private String roof;
	private String pool;
	private String basement;
	
	public String getHouseDoor() {
		return door;
	}
	public void setHouseDoor(String door) {
		this.door = door;
	}
	public String getHouseWindows() {
		return windows;
	}
	public void setHouseWindows(String windows) {
		this.windows = windows;
	}
	public String getHouseRoof() {
		return roof;
	}
	public void setHouseRoof(String roof) {
		this.roof = roof;
	}
	public String getPool() {
		return pool;
	}
	@Override
	public void setHousePool(String pool) {
		this.pool = pool;
		
	}
	@Override
	public void setBasement(String basement) {
		this.basement=basement;
	}
	public String getBasement() {
		return basement;
	}
	
}
