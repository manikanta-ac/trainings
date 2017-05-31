package com.imani.dp.bridge;

public class FileSystemPersistenceImplementor implements PersistenceImplementor {

	@Override
	public long saveObject(Object object) {
		System.out.println("Writing to File!");
		return 0;
	}

	@Override
	public void deleteObject(long objectId) {
		System.out.println("Deleting from File!");
	}

	@Override
	public Object getObject(long objectId) {
		System.out.println("Reading from File!");
		return null;
	}

}
