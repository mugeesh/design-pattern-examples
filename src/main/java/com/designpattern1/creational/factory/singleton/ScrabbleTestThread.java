package com.designpattern1.creational.factory.singleton;

import java.util.LinkedList;

public class ScrabbleTestThread {
	public static void main(String[] args) {

		Runnable getTiles = new GetTheTiles();

		Runnable getTilesAgain = new GetTheTiles();

		new Thread(getTiles).start();
		new Thread(getTilesAgain).start();
		new Thread(new GetTheTiles()).start();

	}
}

class GetTheTiles implements Runnable {

	@Override
	public void run() {
		Singleton newInstance = Singleton.getIstance();

		System.out.println("Instance ID:" + System.identityHashCode(newInstance));
		System.out.println(newInstance.getLetterList());

		LinkedList<String> playerOneTiles = newInstance.geTiles(7);
		System.out.println("Player:" + playerOneTiles);

		System.out.println("Got Tiles");

	}

}