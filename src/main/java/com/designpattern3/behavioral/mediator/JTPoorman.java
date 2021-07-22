package com.designpattern3.behavioral.mediator;

public class JTPoorman extends Colleague{

	public JTPoorman(Mediator mediator, int colleagueCode) {
		super(mediator, colleagueCode);
		System.out.println("JTPoorman  signup for exchange");
	}
	
}

