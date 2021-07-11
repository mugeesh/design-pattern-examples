package com.designpattern1.creational.factory.design;

public class SMSNotification implements Notification {

	@Override
	public void notifyUser() {
        System.out.println("Sending a SMS notification");
	}

}
