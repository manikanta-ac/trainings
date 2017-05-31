package com.imani.dp.composite;

public interface Component {
	String getName();

	String getSize();

	void delete();

	void transfer(String path);
}
