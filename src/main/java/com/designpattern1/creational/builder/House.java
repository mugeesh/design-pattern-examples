package com.designpattern1.creational.builder;

//The concrete House class based on the HousePlan interface

//https://refactoring.guru/design-patterns/builder
//https://www.youtube.com/watch?v=9XnsOpjclUg&list=PLF206E906175C7E07&index=8
class House implements HousePlan {

	private String basement;
	private String structure;
	private String roof;
	private String interior;

	public void setBasement(String basement) {
		this.basement = basement;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public void setRoof(String roof) {
		this.roof = roof;
	}

	public void setInterior(String interior) {
		this.interior = interior;
	}

	@Override
	public String toString() {
		return "\nbasement = " + this.basement + ", structure = " + this.structure + ", roof = " + this.roof
				+ ", interior = " + this.interior;
	}
}
