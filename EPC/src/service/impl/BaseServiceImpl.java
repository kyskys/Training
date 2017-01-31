package service.impl;

import java.util.List;

import dao.BaseDAO;
import model.BaseModel;
import service.BaseService;
import sort.SortParams;

public abstract class BaseServiceImpl<T extends BaseModel> implements
		BaseService<T> {

	@Override
	public boolean create(T entity) {
		return getBaseDAO().create(entity);
	}

	@Override
	public boolean delete(T entity) {
		return getBaseDAO().delete(entity);
	}

	@Override
	public boolean update(T entity) {
		return getBaseDAO().update(entity);
	}

	@Override
	public T get(Long id) {
		return getBaseDAO().get(id);
	}

	@Override
	public List<T> getAll(SortParams params) {
		if (params != null) {
			sort(params);
		}
		return getBaseDAO().getAll();
	}

	@Override
	public void sort(SortParams params) {
		getBaseDAO().sort(params);
	}

	@Override
	public StringBuilder showAll() {
		StringBuilder s = new StringBuilder();
		for (BaseModel t : getBaseDAO().getAll()) {
			s.append(t.getName()+" ");
		}
		return s;
	}

	protected abstract BaseDAO<T> getBaseDAO();

}
