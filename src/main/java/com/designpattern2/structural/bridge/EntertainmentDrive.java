package com.designpattern2.structural.bridge;

abstract class EntertainmentDevice {

	public int deviceState;

	public int maxSetting;

	public int volumeLevel = 0;

	public abstract void buttinFivePressed();

	public abstract void buttinSixPressed();

	public void devideFeedback() {
		if (deviceState > maxSetting || deviceState < 0) {
			deviceState = 0;
		}
		System.out.println("On "+deviceState);
	}
	
	public void buttonSevenPressed() {
		volumeLevel++;
		System.out.println("Volumne at: "+volumeLevel);
	}
	public void buttonEightPressed() {
		volumeLevel--;
		System.out.println("Volumne at: "+volumeLevel);
	}
}
