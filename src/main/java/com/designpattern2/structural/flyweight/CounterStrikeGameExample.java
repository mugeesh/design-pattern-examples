package com.designpattern2.structural.flyweight;
/*
 * to reuse already existing similar kind of objects by storing them 
 * and create new object when no matching object is found
 * Used when you need to create large number of similar objects
 * It reduces the number of objects.
 * It reduces the amount of memory and storage devices required if the objects are persisted
 */

//Flyweight pattern is used when we need to create a large number of similar objects (say 105). 
//flyweight objects is that they are immutable

import java.util.Random;

//Exmaple https://www.geeksforgeeks.org/flyweight-design-pattern/

//Counter Strike Game
//Driver class
public class CounterStrikeGameExample {
	// All player types and weapon (used by getRandPlayerType()
	// and getRandWeapon()
	private static String[] playerType = { "Terrorist", "CounterTerrorist" };
	private static String[] weapons = { "AK-47", "Maverick", "Gut Knife", "Desert Eagle" };

	// Driver code
	public static void main(String args[]) {
		/*
		 * Assume that we have a total of 10 players in the game.
		 */
		for (int i = 0; i < 100; i++) {
			/*
			 * getPlayer() is called simply using the class name since the method is a
			 * static one
			 */
			Player p = PlayerFactory.getPlayer(getRandPlayerType());

			/*
			 * Assign a weapon chosen randomly uniformly from the weapon array
			 */
			p.assignWeapon(getRandWeapon());

			// Send this player on a mission
			p.mission();
		}
	}

	// Utility methods to get a random player type and
	// weapon
	public static String getRandPlayerType() {
		Random r = new Random();

		// Will return an integer between [0,2)
		int randInt = r.nextInt(playerType.length);

		// return the player stored at index 'randInt'
		return playerType[randInt];
	}

	public static String getRandWeapon() {
		Random r = new Random();

		// Will return an integer between [0,5)
		int randInt = r.nextInt(weapons.length);

		// Return the weapon stored at index 'randInt'
		return weapons[randInt];
	}
}