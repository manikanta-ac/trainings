package com.imani.dp.prototype;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		// Only the first object is created
		CarPrototype car1OfModel1 = new CarModel1();
		System.out.println("First Car: " + car1OfModel1.getModelName());

		// Always create another object from model1 as prototype
		CarPrototype car2OfModel1 = car1OfModel1.clone();
		System.out.println("Second Car: " + car2OfModel1.getModelName());

		CarPrototype car3OfModel1 = car1OfModel1.clone();
		System.out.println("Third Car: " + car3OfModel1.getModelName());
	}
}
