package com.imani.dp.composite;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Folder implements Component {
	private String name;
	private List<Component> files;

	public Folder(String name) {
		this.name = name;
		files = new ArrayList<>();
		System.out.println("Folder " + name + " created!!!");
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getSize() {
		// Sum of all files sizes
		return "3MB";
	}

	@Override
	public void delete() {
		System.out.println("Deleted folder " + this.name + "!!!");
	}

	@Override
	public void transfer(String path) {
		System.out.println("Transferred folder " + this.name + " to " + path);
	}

	public Component getFile(int index) {
		if (index < files.size()) {
			System.out.println("Found :" + files.get(index).getName());
			return files.get(index);
		} else {
			System.out.println(new FileNotFoundException().getMessage());
		}
		return null;
	}

	public void addFile(Component file) {
		System.out.println("Adding " + file.getName() + "into " + this.name);
		this.files.add(file);
	}

}
