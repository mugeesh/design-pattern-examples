package com.designpattern1.creational.factory.ex2;

public class NotificationFactory {

	public Notification createNotification(String method) {
		if (method.equals("SMS"))
			return new SMSNotification();
		if (method.equals("EMAIL"))
			return new EmailNotification();
		if (method.equals("PUSH"))
			return new PUSHNotification();
		return null;
	}
}
