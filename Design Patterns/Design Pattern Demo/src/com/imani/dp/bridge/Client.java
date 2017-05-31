package com.imani.dp.bridge;

public class Client {
	public static void main(String[] args) {
		
		PersistenceImplementor implementor = null;
		
		if (databaseDriverExists()) {
			implementor = new DabatasePersistenceImplementor();
		} else {
			implementor = new FileSystemPersistenceImplementor();
		}

		Persistence persistenceAPI = new PersistenceImpl(implementor);

		Object o = persistenceAPI.findById("1");

		persistenceAPI.persist(o);

		persistenceAPI.deleteById("1");

	}

	private static boolean databaseDriverExists() {
		return true;
	}
}
