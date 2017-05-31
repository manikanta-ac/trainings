package com.imani.dp.facade;

public class CPU {
	public void startpProcessor() {
		System.out.println("Starting Processor!!!");
	}

	public void startTask(String task) {
		System.out.println("Starting Task " + task + "!!!");
	}

	public void stopTask(String task) {
		System.out.println("Stopping Task " + task + "!!!");
	}

	public void shutdownProcessor() {
		System.out.println("Shutting Down Processor!!!");
	}
}
