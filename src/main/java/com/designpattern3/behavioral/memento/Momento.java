package com.designpattern3.behavioral.memento;

public class Momento {
	
	//Its Just POJO
	
	private String article;
	
	public Momento(String articleSave) {
		article=articleSave;
	}
	
	public String getSaveArticle() {
		return article;
	}
}

