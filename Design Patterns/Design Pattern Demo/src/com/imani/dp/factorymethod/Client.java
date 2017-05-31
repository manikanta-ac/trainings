package com.imani.dp.factorymethod;

public class Client {
	public static void main(String[] args) {
		HiringFactory hiringFactory = new ABCHiringFactory();

		String newRequirement = "tester";

		System.out.println("Company: Need a " + newRequirement);

		Employee newJoinee = hiringFactory.hireEmployee(newRequirement);

		System.out.println("Company: Welcome " + newJoinee.getName() + " !!!");
	}
}
