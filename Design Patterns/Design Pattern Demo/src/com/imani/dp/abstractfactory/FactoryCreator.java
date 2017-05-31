package com.imani.dp.abstractfactory;

public class FactoryCreator {
	public static HiringFactory getFactory(String empType) {
		if (empType.equalsIgnoreCase("Manager")) {
			return new ManagerHiringFactory();
		} else if (empType.equalsIgnoreCase("Developer")) {
			return new DeveloperHiringFactory();
		} else if (empType.equalsIgnoreCase("Tester")) {
			return new TesterHiringFactory();
		} else if (empType.equalsIgnoreCase("HR")) {
			return new HRHiringFactory();
		} else {
			return null;
		}
	}
}
