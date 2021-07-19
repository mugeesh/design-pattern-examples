package com.designpattern3.behavioral.iterator;

/*
 * Iterator is a behavioral design pattern that lets you traverse elements of a collection 
 * without exposing its underlying representation (list, stack, tree, etc.).
 */

//Reference : https://www.youtube.com/watch?v=VKIzUuMdmag&list=PLF206E906175C7E07&index=17

/*
 * The Iterator pattern provides you with a uniform way to access different collections of objects
 * 
 */

public class RadioStationExample {

	public static void main(String[] args) {

		SongsOfThe70s songs70s = new SongsOfThe70s();
		SongsOfThe80s songs80s = new SongsOfThe80s();
		SongsOfThe90s songs90s = new SongsOfThe90s();

		DiscJockey madMike = new DiscJockey(songs70s, songs80s, songs90s);

		// madMike.showTheSongs();

		madMike.showTheSongs2();

	}

}
