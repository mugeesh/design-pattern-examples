package com.designpattern2.structural.flyweight;

//A Java program to demonstrate working of
//FlyWeight Pattern with example of Counter
//Strike Game
import java.util.Random;
import java.util.HashMap;

//A common interface for all players
interface Player {
	public void assignWeapon(String weapon);

	public void mission();
}

//Terrorist must have weapon and mission
class Terrorist implements Player {
	// Intrinsic Attribute
	private final String TASK;

	// Extrinsic Attribute
	private String weapon;

	public Terrorist() {
		TASK = "PLANT A BOMB";
	}

	public void assignWeapon(String weapon) {
		// Assign a weapon
		this.weapon = weapon;
	}

	public void mission() {
		// Work on the Mission
		System.out.println("Terrorist with weapon " + weapon + "|" + " Task is " + TASK);
	}
}

//CounterTerrorist must have weapon and mission
class CounterTerrorist implements Player {
	// Intrinsic Attribute
	private final String TASK;

	// Extrinsic Attribute
	private String weapon;

	public CounterTerrorist() {
		TASK = "DIFFUSE BOMB";
	}

	public void assignWeapon(String weapon) {
		this.weapon = weapon;
	}

	public void mission() {
		System.out.println("Counter Terrorist with weapon " + weapon + "|" + " Task is " + TASK);
	}
}

