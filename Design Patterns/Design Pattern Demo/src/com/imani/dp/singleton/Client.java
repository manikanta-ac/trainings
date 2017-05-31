package com.imani.dp.singleton;

public class Client {
	public static void main(String[] args) {
		//Singleton object = new Singleton();
		
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.hashCode());

		Singleton newObject = Singleton.getInstance();
		System.out.println(newObject.hashCode());
	}
}
