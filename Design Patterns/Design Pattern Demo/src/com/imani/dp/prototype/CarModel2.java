package com.imani.dp.prototype;

public class CarModel2 extends CarPrototype {

	@Override
	public CarPrototype clone() throws CloneNotSupportedException {
		System.out.println("Cloning Model-2");
		setModelName("Model-2");
		return (CarPrototype) super.clone();
	}

}
