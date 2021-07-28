package com.designpattern1.creational.factory2;

public class EmailNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Sending a EMail notification");
	}

	 
}
