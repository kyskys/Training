package dao.impl;

import java.util.ArrayList;
import java.util.List;

import sort.SortParams;
import dao.BaseDAO;
import model.BaseModel;

public abstract class BaseDAOImpl<T extends BaseModel> implements BaseDAO<T> {
	private BaseDAOImpl instance;
	private static Long id = (long) 0;
	private List<T> list = new ArrayList<T>();

	@Override
	public boolean create(T entity) {
		entity.setId(++id);
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

	@Override
	public T getInstance() {
		if (instance == null) {
			instance = new BaseDAOImpl();
		}
		return instance;
	}

	protected abstract void sort(List<T> list, SortParams params);
}
