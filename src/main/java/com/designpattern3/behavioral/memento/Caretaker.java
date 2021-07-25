package com.designpattern3.behavioral.memento;

import java.util.ArrayList;

public class Caretaker {
	ArrayList<Momento> saveArticles = new ArrayList<Momento>();

	public void addMemento(Momento m) {
		saveArticles.add(m);
	}

	public Momento getMemento(int index) {
		return saveArticles.get(index);
	}

}
