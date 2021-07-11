package com.designpattern2.structural.bridge;

public abstract class RemoteButton {
	
	private EntertainmentDevice theDevice;

	public RemoteButton(EntertainmentDevice newDevice) {
		theDevice = newDevice;
	}

	public void buttinFivePressed() {
		theDevice.buttinFivePressed();
	}
	public void buttinSixPressed() {
		theDevice.buttinSixPressed();
	}
	public void devideFeedback() {
		theDevice.devideFeedback();
	}
	
	public abstract void buttonNinePressed();
}
