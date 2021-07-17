package com.designpattern2.structural.proxy;
/*Definition
 * Proxy Design pattern :  provide a class which will limit access to another class.
 * you may do this for security reasons, because an object is intensive to create, or is accessed from a remote location. 
 */

//https://www.javatpoint.com/proxy-pattern

public class ProxyPatternClientExample {

	public static void main(String[] args) {

		String employeeName = "Mugeesh";

		WifiAccess wifiAccess = new ProxyWifiAccess(employeeName);
		wifiAccess.grantWifiAccess();

	}
}
