package com.imani.dp.factorymethod;

public class Manager extends Employee {
	private boolean manager;
	
	public Manager(boolean manager, String empType) {
		this.manager = manager;
		setName(empType);
	}

	public boolean isManager() {
		return manager;
	}

	public void setManager(boolean manager) {
		this.manager = manager;
	}

}
