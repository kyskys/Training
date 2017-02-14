package dao.impl;

import java.util.List;

import storage.StorageDAO;
import dao.BaseDAO;
import model.BaseModel;

public abstract class BaseDAOImpl<T extends BaseModel> implements BaseDAO<T> {
	
	private static Long id;
	protected List<T> list;

	@Override
	public boolean create(T entity) {
		id = StorageDAO.setId();
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
