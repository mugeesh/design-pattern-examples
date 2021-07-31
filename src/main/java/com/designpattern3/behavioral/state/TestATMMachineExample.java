package com.designpattern3.behavioral.state;
//http://www.newthinktank.com/2012/10/state-design-pattern-tutorial/

/*A State Pattern says that "the class behaviour changes based on its state". 
 * In State Pattern, we create objects which represent various states and a context object
 *  whose behaviour varies as its state object changes.
 *  */

/*here in this example, we are changing the state of the ATMMachine program
 * 
 */

//state design pattern
public class TestATMMachineExample {

	public static void main(String[] args) {

		ATMMachine atmMachine = new ATMMachine();

		atmMachine.insertCard();

		atmMachine.ejectCard();

		atmMachine.insertCard();

		atmMachine.insertPin(1234);

		atmMachine.requestCash(2000);

		atmMachine.insertCard();

		atmMachine.insertPin(1234);

	}
}