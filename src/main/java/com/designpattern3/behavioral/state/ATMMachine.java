package com.designpattern3.behavioral.state;

//This is a context class
public class ATMMachine {

	ATMState hasCard;
	ATMState noCard;
	ATMState hasCorrectPin;
	ATMState atmOutOfMoney;

	//this is a state(maintain state)
	ATMState atmState;

	int cashInMachine = 2000;
	boolean correctPinEntered = false;

	public ATMMachine() {

		hasCard = new HasCard(this);
		noCard = new NoCard(this);
		hasCorrectPin = new HasPin(this);
		atmOutOfMoney = new NoCash(this);

		//default state is nocard
		atmState = noCard;

		if (cashInMachine < 0) {
			atmState = atmOutOfMoney;
		}
	}

	//here we are changing the state
	void setATMState(ATMState newATMState) {
		atmState = newATMState;
	}

	public void setCashInMachine(int newCashInMachine) {
		cashInMachine = newCashInMachine;
	}

	public void insertCard() {
		atmState.insertCard();
	}

	public void ejectCard() {
		atmState.ejectCard();
	}

	public void requestCash(int cashToWithdraw) {
		atmState.requestCash(cashToWithdraw);
	}

	public void insertPin(int pinEntered) {
		atmState.insertPin(pinEntered);
	}

	public ATMState getYesCardState() {
		return hasCard;
	}

	public ATMState getNoCardState() {
		return noCard;
	}

	public ATMState getHasPin() {
		return hasCorrectPin;
	}

	public ATMState getNoCashState() {
		return atmOutOfMoney;
	}

}