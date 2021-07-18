package com.designpattern3.behavioral.commandpattern;
public class TVRemote {
	
	public static ElectronicDevice getDevice(){
		//here we cab use factory design pattern
		return new Television();
		
	}
	
}