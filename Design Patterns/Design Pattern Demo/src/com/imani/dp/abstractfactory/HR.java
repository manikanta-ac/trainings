package com.imani.dp.abstractfactory;

public class HR extends Employee {
	private boolean hr;

	public HR(boolean hr, String empType) {
		this.hr = hr;
		setName(empType);
	}

	public boolean isHr() {
		return hr;
	}

	public void setHr(boolean hr) {
		this.hr = hr;
	}

}
