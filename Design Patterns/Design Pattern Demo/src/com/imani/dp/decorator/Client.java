package com.imani.dp.decorator;

public class Client {
	public static void main(String[] args) {
		Window window = new SimpleWindow();

		window.renderWindow();

		System.out.println("----------------------------------------");

		// decorate old window
		window = new ScrollableWindow(window);

		window.renderWindow();
	}
}
