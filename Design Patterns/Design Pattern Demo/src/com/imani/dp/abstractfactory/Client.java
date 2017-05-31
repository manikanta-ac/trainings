package com.imani.dp.abstractfactory;

public class Client {
	public static void main(String[] args) {
		HiringFactory factory = FactoryCreator.getFactory("developer");
		factory.hireEmployee();
		factory.trainEmployee();
	}
}
