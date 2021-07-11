package com.designpattern1.creational.factory.prototype;
public class TestCloning {
	
	public static void main(String[] args){
		
		// Handles routing makeCopy method calls to the 
		// right subclasses of Animal
		
		//TODO this is  option
		CloneFactory animalMaker = new CloneFactory();
		
		
		// Creates a new Sheep instance
		
		Sheep sally = new Sheep();
		System.out.println("----1.");
		// Creates a clone of Sally and stores it in its own
		// memory location
		
		//TODO using direct access
		Animal animalSample=new Sheep();
		Sheep clonedSheep = (Sheep) animalSample.makeCopy();
		
		//This is optional if we use CloneFactory
		//Sheep clonedSheep = (Sheep) animalSample.makeCopy().getClone(sally);
		
		// These are exact copies of each other
		
		System.out.println(sally);
		System.out.println("----2.");
		System.out.println(clonedSheep);
		System.out.println("----3.");
		System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(sally)));
		
		System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonedSheep)));
	}
	
}