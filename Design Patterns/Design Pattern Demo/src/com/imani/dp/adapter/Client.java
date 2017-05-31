package com.imani.dp.adapter;

public class Client {
	public static void main(String[] args) {
		
		MicroSDCard microSDCard = new MicroSDCard();

		SDCard sdCard = new SDCardAdapter();
		
		sdCard.transferFiles(microSDCard);
	}
}
