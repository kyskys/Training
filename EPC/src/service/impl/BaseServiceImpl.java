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
		return getBaseDAO().getAll(params);
	}

	protected abstract BaseDAO<T> getBaseDAO();

}
