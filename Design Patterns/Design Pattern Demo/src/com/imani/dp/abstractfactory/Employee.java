package com.imani.dp.abstractfactory;

public abstract class Employee {
	private String name;
	private String emaol;
	private int age;
	private int experiance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmaol() {
		return emaol;
	}

	public void setEmaol(String emaol) {
		this.emaol = emaol;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExperiance() {
		return experiance;
	}

	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}
}
