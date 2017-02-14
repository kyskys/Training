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
		List<T> list = getBaseDAO().getAll();
		if (params != null) {
			sort(params, list);
		}
		return list;
	}

	@Override
	public String getAllAsString() {
		String s = null;
		List<T> list = getBaseDAO().getAll();
		for (int i = 0; i < list.size(); i++) {
			s += i + ". " + list.get(i) + "\n";
		}
		return s;
	}

	@Override
	public int totalCount() {
		return getBaseDAO().getAll().size();
	}

	protected abstract BaseDAO<T> getBaseDAO();

	protected abstract void sort(SortParams params, List<T> list);

}
