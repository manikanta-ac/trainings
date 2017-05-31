package com.imani.dp.proxy;

public class Client {
	public static void main(String[] args) {
		InternetProvider internetProvider = new OfficeProxy();
		internetProvider.accessURL("www.google.com");
		internetProvider.accessURL("www.cricket360.com");
		internetProvider.accessURL("www.java.com");
	}
}
