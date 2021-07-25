package com.designpattern3.behavioral.memento;

public class Originator {
	private String article;

	public void setArticle(String article) {
		System.out.println("From Originator : Current Version of Article: " + article + " \n");
		this.article = article;
	}

	public Momento storeInMemento() {
		System.out.println("From Originator : Saving to Memory");
		return new Momento(article);
	}
	
	public String restoreFromMemento(Momento momento) {
		article=momento.getSaveArticle();
		System.out.println("From Originator : Previous Article Save in Memento:\n"
				+article+ " \n");
		return article;

	}

	public String getArticle() {
		return article;
	}
	
}
