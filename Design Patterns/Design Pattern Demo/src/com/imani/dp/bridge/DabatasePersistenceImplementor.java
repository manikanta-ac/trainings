package com.imani.dp.bridge;

public class DabatasePersistenceImplementor implements PersistenceImplementor {

	@Override
	public long saveObject(Object object) {
		System.out.println("Saving to DB!");
		return 0;
	}

	@Override
	public void deleteObject(long objectId) {
		System.out.println("Deleting from DB!");
	}

	@Override
	public Object getObject(long objectId) {
		System.out.println("Getting from DB!");
		return null;
	}

}
