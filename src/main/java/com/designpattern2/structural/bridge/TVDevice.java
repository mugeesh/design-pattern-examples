package com.designpattern2.structural.bridge;

public class TVDevice extends EntertainmentDevice {

	public TVDevice(int newDriveState, int newMaxSetting) {
		devideState = newDriveState;
		maxSetting = newMaxSetting;
	}

	public int devideState;

	public int maxSetting;

	public int volumeLevel = 0;

	public void devideFeedback() {
		if (devideState > maxSetting || devideState < 0) {
			devideState = 0;
		}
		System.out.println("On " + devideState);
	}

	@Override
	public void buttinFivePressed() {
		System.out.println("Channel Down");
		devideState--;
	}

	@Override
	public void buttinSixPressed() {
		System.out.println("Channel Up");
		devideState++;
	}
}
