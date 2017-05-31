package com.imani.dp.factorymethod;

public class Tester extends Employee {
	private String testingType;

	public Tester(String testingType, String empType) {
		this.testingType = testingType;
		setName(empType);
	}

	public String getTestingType() {
		return testingType;
	}

	public void setTestingType(String testingType) {
		this.testingType = testingType;
	}

}
