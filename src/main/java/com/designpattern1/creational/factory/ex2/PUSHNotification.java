package com.designpattern1.creational.factory.ex2;

public class PUSHNotification implements Notification {

	@Override
	public void notifyUser() {
        System.out.println("Sending a SMS notification");
	}

}
