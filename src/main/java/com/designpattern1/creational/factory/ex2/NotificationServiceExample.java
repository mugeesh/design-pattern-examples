package com.designpattern1.creational.factory.ex2;

//geek
public class NotificationServiceExample {
	public static void main(String[] args) {
		NotificationFactory notificationFactory = new NotificationFactory();
		Notification notification = notificationFactory.createNotification("SMS");
		notification.notifyUser();
	}
}
