package com.imani.dp.prototype;

public class CarModel1 extends CarPrototype {
	
	public CarModel1() {
		setModelName("Model-1");
	}
	
	@Override
	public CarPrototype clone() throws CloneNotSupportedException {
		System.out.println("Cloning Model-1");
		setModelName("Model-1");
		return (CarPrototype) super.clone();
	}

}
