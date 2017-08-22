package dao;

import java.util.List;

import model.BaseModel;

public interface BaseDAO<T extends BaseModel> {
	boolean create(T entity);

	boolean delete(T entity);

	boolean update(T entity);

	T get(Long id);

	List<T> getAll();
}
