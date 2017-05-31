package com.imani.dp.builder;

public class Client {
	public static void main(String[] args) {
		Computer computer1 = new Computer.ComputerBuilder("524GB", "4GB")
				.withSpeakers("Sony").withBluetooth("yes").build();

		System.out.println(computer1.getHardDsik() + ":" + computer1.getRam()
				+ ":" + computer1.getSpeakers() + ":"
				+ computer1.getBluetooth());

		Computer computer2 = new Computer.ComputerBuilder("256Gb", "2GB")
				.withSpeakers("JBL").withBluetooth("no").build();

		System.out.println(computer2.getHardDsik() + ":" + computer2.getRam()
				+ ":" + computer2.getSpeakers() + ":"
				+ computer2.getBluetooth());

	}
}
