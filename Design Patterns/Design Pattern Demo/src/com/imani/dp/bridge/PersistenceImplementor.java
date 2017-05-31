package com.imani.dp.bridge;

public interface PersistenceImplementor {
	long saveObject(Object object);

	void deleteObject(long objectId);

	Object getObject(long objectId);
}
