package com.designpattern2.structural.decorator;

// extra theory : https://refactoring.guru/design-patterns/decorator
//reference : http://www.newthinktank.com/2012/09/decorator-design-pattern-tutorial/

public class PizzaMakerExample {

	public static void main(String[] args) {

		// The PlainPizza object is sent to the Mozzarella constructor
		// and then to the TomatoSauce constructor

		Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

		System.out.println("Ingredients: " + basicPizza.getDescription());

		System.out.println("Price: " + basicPizza.getCost());
		System.out.println("----------------");
		System.out.println("three pizza....");

		Pizza threePIzza = new ThreeCheesePizza();
		System.out.println("Ingredients: " + threePIzza.getDescription());
		System.out.println("Price: " + threePIzza.getCost());
		System.out.println("----------------");
		System.out.println("three pizza with tomoto sauce");
		
		threePIzza = new TomatoSauce(new ThreeCheesePizza());
		System.out.println("Ingredients: " + threePIzza.getDescription());
		System.out.println("Price: " + threePIzza.getCost());

	}

}