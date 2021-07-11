package com.designpattern1.creational.singleton;

import java.util.LinkedList;

public class ScrabbleTest {
	public static void main(String[] args) {
		Singleton newInstance = Singleton.getIstance();
		System.out.println("Instance 1 ID:" + System.identityHashCode(newInstance));
		System.out.println(newInstance.getLetterList());

		LinkedList<String> playerOneTiles = newInstance.geTiles(7);

		System.out.println("Player 1:" + playerOneTiles);

		System.out.println(newInstance.getLetterList());

		Singleton InstanceTwo = Singleton.getIstance();
		System.out.println("Instance 2 ID:" + System.identityHashCode(InstanceTwo));

		LinkedList<String> playerTwoTiles = newInstance.geTiles(7);

		System.out.println("Player 2:" + playerTwoTiles);
		System.out.println(newInstance.getLetterList());

	}
}
