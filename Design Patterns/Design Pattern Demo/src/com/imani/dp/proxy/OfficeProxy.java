package com.imani.dp.proxy;

public class OfficeProxy implements InternetProvider {
	private InternetProvider internetProvider;
	
	public OfficeProxy() {
		internetProvider = new ABCInternetProvider();
	}
	
	@Override
	public void accessURL(String url) {
		if(isAccessable(url)) {
			internetProvider.accessURL(url);
		} else {
			System.out.println("URL "+ url +" is blocked!!!");
		}
	}

	private boolean isAccessable(String url) {
		return !url.contains("cricket");
	}

}
