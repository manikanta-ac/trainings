package com.imani.dp.proxy;

public class ABCInternetProvider implements InternetProvider {

	@Override
	public void accessURL(String url) {
		System.out.println("Accessing URL:" + url);
	}

}
