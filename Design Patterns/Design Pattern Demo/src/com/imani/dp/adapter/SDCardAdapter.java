package com.imani.dp.adapter;

public class SDCardAdapter implements SDCard {

	@Override
	public void transferFiles(MicroSDCard microSDCard) {
		System.out.println("Files transfer started through adapter!!!");
		microSDCard.readFiles();
		microSDCard.writeFiles();
		System.out.println("Files transfer completed.");
	}
}
