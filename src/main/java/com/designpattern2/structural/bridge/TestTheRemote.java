package com.designpattern2.structural.bridge;

public class TestTheRemote {

	public static void main(String[] args) {
		RemoteButton theTV = new TVRemoteMute(new TVDevice(1, 200));
		RemoteButton theTV2 = new TVRemotePause(new TVDevice(1, 200));
		// HOMEWORK --------------
		RemoteButton theDVD = new DVDRemote(new DVDDevice(1, 14));
		// -----------------------

		System.out.println("Test TV with Mute");
		theTV.buttinFivePressed();
		theTV.buttinSixPressed();
		theTV.buttonNinePressed();
		//theTV.devideFeedback();
		
		System.out.println("Test TV with Pause");
		theTV2.buttinFivePressed();
		theTV2.buttinSixPressed();
		theTV2.buttinSixPressed();
		theTV2.buttinSixPressed();
		theTV2.buttinSixPressed();
		theTV2.buttonNinePressed();
		theTV2.devideFeedback();
		
        // HOMEWORK
		System.out.println("\nTest DVD");
        theDVD.buttinFivePressed();
        theDVD.buttinSixPressed();
        theDVD.buttonNinePressed();
        theDVD.buttonNinePressed();

	}
}
