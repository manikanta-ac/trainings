package com.imani.dp.facade;

public class Client {
	public static void main(String[] args) {
		ComputerFacade computer = new ComputerFacade();
		computer.start();
		computer.playMovie();
		computer.shutdown();
	}
}
