package com.designpattern2.structural.adaptor;

//https://blog.usejournal.com/adapter-design-pattern-acd51418572f
interface Android {
	void charge();
	void phoneIsProtectedFromWater(boolean ifprotected);
}

interface IPhone {
	void charge();
	void phoneIsProtectedFromWater(boolean ifprotected);
}

class AndroidCharger implements Android {

	public void charge() {
		System.out.println("Android phone is charging");
	}

	@Override
	public void phoneIsProtectedFromWater(boolean ifprotected) {
		System.out.println("Andriod: Is it protected from water? " + ifprotected);
	}
	
}

class IPhoneCharger implements IPhone {

	public void charge() {
		System.out.println("Iphone is charging");
	}
	@Override
	public void phoneIsProtectedFromWater(boolean ifprotected) {
		System.out.println("iphone Is it protected from water? " + ifprotected);
	}
}

/**
 * This is the adapter class which implements [IPhone] but it charge the android
 * phone through the constructor [IPhoneToAndroidAdapter]
 */
class IPhoneToAndroidAdapter implements IPhone {

	Android androidCharger;

	public IPhoneToAndroidAdapter(Android androidCharger) {
		this.androidCharger = androidCharger;
	}

	@Override
	public void charge() {
		androidCharger.charge();
	}

	@Override
	public void phoneIsProtectedFromWater(boolean ifprotected) {
		androidCharger.phoneIsProtectedFromWater(ifprotected);
	}

}

public class AdoptorExample {

	public static void main(String[] args) {

		// This will charge android phone
		Android androidCharger = new AndroidCharger();
		androidCharger.charge();

		// This will charge IPhone
		IPhone iPhoneCharger = new IPhoneCharger();
		iPhoneCharger.charge();

		// How to charge iphone with android charger?
		IPhoneToAndroidAdapter adapter = new IPhoneToAndroidAdapter(androidCharger);
		adapter.charge();
		adapter.phoneIsProtectedFromWater(false);

	}
}

//Summary
//An adapter is generally used in a situation where you don’t want to change your 
//legacy code and you want the old component to the new system. Like Arrays is written 
//earlier after adding list they have written the adapter to take an array as input and 
//adapt it to list as an output i.e Arrays.asList





