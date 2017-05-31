package com.imani.dp.composite;

public class Client {
	public static void main(String[] args) {
		Component file1 = new File("file1.txt", "10Kb");
		file1.transfer("New Folder 1");
		file1.delete();

		System.out.println("-----------------------------------------");

		Component folder1 = new Folder("Folder-1");
		folder1.transfer("New Folder 2");
		folder1.delete();

		System.out.println("-----------------------------------------");

		Folder folder2 = new Folder("Folder-2");
		Component file2 = new File("file2.ppt", "2MB");
		folder2.addFile(file2);
		folder2.getFile(0);

	}
}
