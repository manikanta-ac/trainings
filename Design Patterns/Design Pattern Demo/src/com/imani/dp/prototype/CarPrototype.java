package com.imani.dp.prototype;

public abstract class CarPrototype implements Cloneable {
	private String modelName;
	private double cost;
	private String color;

	public CarPrototype clone() throws CloneNotSupportedException {
		return (CarPrototype) super.clone();
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
