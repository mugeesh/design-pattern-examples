package com.designpattern1.creational.builder;
// The director / engineer class creates a Robot using the

// builder interface that is defined (OldRobotBuilder)

public class CivilEngineer {

		private HouseBuilder houseBuilder;

		public CivilEngineer(HouseBuilder houseBuilder) {
			this.houseBuilder = houseBuilder;
		}

		public House getHouse() {
			return this.houseBuilder.getHouse();
		}

		public void buildHouse() {
			this.houseBuilder.buildBasement();
			this.houseBuilder.buildStructure();
			this.houseBuilder.bulidRoof();
			this.houseBuilder.buildInterior();
		}
}