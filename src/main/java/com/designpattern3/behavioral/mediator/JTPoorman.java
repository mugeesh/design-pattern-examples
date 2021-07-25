package com.designpattern3.behavioral.mediator;

public class JTPoorman extends Colleague {

	public JTPoorman(Mediator newMediator) {
		super(newMediator);
		// super(mediator, colleagueCode);
		System.out.println("JT Poorman signed up with the stockexchange\n");

	}
}
