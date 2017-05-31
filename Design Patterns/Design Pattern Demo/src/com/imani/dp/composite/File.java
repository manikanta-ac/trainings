package com.imani.dp.composite;

public class File implements Component {
	private String name;
	private String size;

	public File(String name, String size) {
		this.name = name;
		this.size = size;
		System.out.println("File " + name + " created!!!");
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getSize() {
		return this.size;
	}

	@Override
	public void delete() {
		System.out.println("Deleted file " + this.name + "!!!");
	}

	@Override
	public void transfer(String path) {
		System.out.println("Transferred file " + this.name + " to " + path);
	}

}
