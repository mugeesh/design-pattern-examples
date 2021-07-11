package com.designpattern1.creational.factory;

class GetLogisticPlanFactory {

	// use getPlan method to get object of type Logstics Plan
	public Logstics getPlan(String planType) {
		if (planType == null) {
			return null;
		}
		if (planType.equalsIgnoreCase("road")) {
			return new RoadLogstics();
		} else if (planType.equalsIgnoreCase("sea")) {
			return new SeaLogstics();
		}
		return null;
	}
}// end of GetLogisticPlanFactory class.