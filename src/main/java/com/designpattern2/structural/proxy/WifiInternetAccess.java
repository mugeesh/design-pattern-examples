package com.designpattern2.structural.proxy;

public class WifiInternetAccess implements WifiAccess {

	String employeeName;

	public WifiInternetAccess(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override  
    public void grantWifiAccess() {  
        System.out.println("Internet Access granted for employee: "+ employeeName);  
    }  
}
