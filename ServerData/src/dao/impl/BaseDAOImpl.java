package dao.impl;

import java.util.List;

import dao.BaseDAO;
import model.BaseModel;
import serializer.Serializer;

public abstract class BaseDAOImpl<T extends BaseModel> implements BaseDAO<T> {

	protected List<T> list;

	@Override
	public boolean create(T entity) {
		entity.setId(Serializer.getId());
		return list.add(entity);
	}

	@Override
	public boolean delete(T entity) {
		return list.remove(entity);
	}

	@Override
	public boolean update(T entity) {
		return delete(entity) && list.add(entity);
	}

	@Override
	public T get(Long id) {
		for (T e : list) {
			if (e.getId().equals(id)) {
				return e;
			}
		}
		return null;
	}

	@Override
	public List<T> getAll() {
		return list;
	}
}
