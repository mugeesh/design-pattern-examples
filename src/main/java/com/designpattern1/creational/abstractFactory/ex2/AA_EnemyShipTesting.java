package com.designpattern1.creational.abstractFactory.ex2;

//http://www.newthinktank.com/2012/09/abstract-factory-design-pattern/
public class AA_EnemyShipTesting {
	
public static void main(String[] args) {
		
		// EnemyShipBuilding handles orders for new EnemyShips
		// You send it a code using the orderTheShip method &
		// it sends the order to the right factory for creation
	
		EnemyShipBuilding MakeUFOs = new UFOEnemyShipBuilding();
 
		EnemyShip theGrunt = MakeUFOs.orderTheShip("UFO");
		System.out.println(theGrunt + "\n");
		
		EnemyShip theBoss = MakeUFOs.orderTheShip("UFO BOSS");
		System.out.println(theBoss + "\n");
 
	}
	
}