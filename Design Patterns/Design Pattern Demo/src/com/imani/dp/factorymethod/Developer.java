package com.imani.dp.factorymethod;

import java.util.List;

public class Developer extends Employee {
	private List<String> programmingLangs;

	public Developer(List<String> programmingLangs, String empType) {
		this.programmingLangs = programmingLangs;
		setName(empType);
	}

	public List<String> getProgrammingLangs() {
		return programmingLangs;
	}

	public void setProgrammingLangs(List<String> programmingLangs) {
		this.programmingLangs = programmingLangs;
	}

}
