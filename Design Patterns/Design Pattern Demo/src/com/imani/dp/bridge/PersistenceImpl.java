package com.imani.dp.bridge;

public class PersistenceImpl implements Persistence {

	private PersistenceImplementor implementor = null;

	public PersistenceImpl(PersistenceImplementor imp) {
		this.implementor = imp;
	}

	@Override
	public String persist(Object object) {
		return Long.toString(implementor.saveObject(object));
	}

	@Override
	public Object findById(String objectId) {
		return implementor.getObject(Long.parseLong(objectId));
	}

	@Override
	public void deleteById(String id) {
		implementor.deleteObject(Long.parseLong(id));
	}

}
