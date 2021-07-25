package com.designpattern3.behavioral.memento;

//https://www.youtube.com/watch?v=jOnxYT8Iaoo&list=PLF206E906175C7E07&index=25&ab_channel=DerekBanas

/*A way to store previous state of an object easily:
 * It is like a Save & undo button (it hold previous state)
 
 
 * Momento: this basic object that i stored in different states. 
 * Originator: Sets and Gets values from the currently targeted Momento. Its just a POJO.
 * Creates new Momentos and assign current values to them.
 * CareTaker: Holds an ArrayList that contains all previous versions of the Momento.
 * IT can store and retrieve stored Moementos.
 */

public class TestMemento {

	public static void main(String[] args) {
		Originator originator = new Originator();

		Caretaker careTaker = new Caretaker();

		originator.setArticle("Article #1");
		careTaker.addMemento(originator.storeInMemento());

		originator.setArticle("Article #2");
		careTaker.addMemento(originator.storeInMemento());

		originator.setArticle("Article #3");
		careTaker.addMemento(originator.storeInMemento());

		originator.setArticle("Article #4");
		careTaker.addMemento(originator.storeInMemento());

		System.out.println("-------");
		System.out.println("Current Article: " + originator.getArticle());
		originator.restoreFromMemento(careTaker.getMemento(0));

		System.out.println("First saved State: " + originator.getArticle());
		originator.restoreFromMemento(careTaker.getMemento(1));
		System.out.println("Second saved State: " + originator.getArticle());
		originator.restoreFromMemento(careTaker.getMemento(2));
		System.out.println("Third saved State: " + originator.getArticle());

	}

}
