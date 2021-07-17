package com.designpattern2.structural.proxy;

public class ProxyWifiAccess implements WifiAccess {

	private String employeeName;

	WifiInternetAccess wifiInternetAccess;

	public ProxyWifiAccess(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public void grantWifiAccess() {
		int designation = getEmployeeLevel(employeeName);
		if (designation > 10) {
			wifiInternetAccess=new WifiInternetAccess(employeeName);
			wifiInternetAccess.grantWifiAccess();
		} else {
			System.out.println(employeeName + " cannot access wifi access");
		}

	}

	int getEmployeeLevel(String employeeName) {
		// get employee designation
		if (employeeName.equals("Mugeesh")) {
			// this is developer, employee designation level is 10
			return 11;
		}
		return 0;
	}

}
