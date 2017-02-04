package service.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

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
	public StringBuilder getNameAsString() {
		StringBuilder s = new StringBuilder();
		for (BaseModel t : getBaseDAO().getAll()) {
			s.append(t.getName() + " ");
		}
		return s;
	}

	@Override
	public int totalCount() {
		return getBaseDAO().getAll().size();
	}

	@Override
	public Properties getConfig() {
		Properties p = new Properties();
		try {
			FileInputStream fis = new FileInputStream("src/resourses/config.properties");
			p.load(fis);
		} catch (IOException e) {
			System.out.println("missing config file");
			e.printStackTrace();
		}
		return p;
	}
	
	protected abstract BaseDAO<T> getBaseDAO();

	protected abstract void sort(SortParams params, List<T> list);

}
