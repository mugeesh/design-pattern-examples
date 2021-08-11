package com.designpattern1.creational.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

//https://www.youtube.com/watch?v=NZaXM67fxbs&list=PLF206E906175C7E07&index=7
public class Singleton {

	private static Singleton firstInstance = null;

	// holds all my scrabble letters in an array

	String[] scrabbleLetters = { "a", "a", "a", "a", "a", "a", "a", "a", "a", "b", "b", "c", "c", "d", "d", "d", "d",
			"e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h", "h", "i", "i",
			"i", "i", "i", "i", "i", "i", "i", "j", "k", "l", "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n",
			"o", "o", "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r", "r", "r", "s", "s", "s", "s",
			"t", "t", "t", "t", "t", "t", "u", "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z", };
	private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));

	static boolean firstThread = true;

	private Singleton() {
	}

	// public static synchronized on this method Singleton getIstance() {....}
	// if you use synchronized then singleton would be work but it would slow down this getInstace method
	// so we will not use synchronized in singleton
	//public static synchronized Singleton getIstance() {
	
	public static  Singleton getIstance() {
		if (firstInstance == null) {
			if (firstThread) {
				firstThread = false;
				try {
					Thread.sleep(1000); // first thread is sleeping
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			synchronized (Singleton.class) {
				if (firstInstance == null) {
					// lazy instantiation
					firstInstance = new Singleton();
					Collections.shuffle(firstInstance.letterList);
				}
			}
		}
		 
		return firstInstance;
	}

	public LinkedList<String> getLetterList() {
		return firstInstance.letterList;
	}

	public LinkedList<String> geTiles(int howManyTiles) {
		LinkedList<String> tilesToSend = new LinkedList<String>();
		for (int i = 0; i < howManyTiles; i++) {
			tilesToSend.add(firstInstance.letterList.remove(0));

		}
		return tilesToSend;
	}

}
