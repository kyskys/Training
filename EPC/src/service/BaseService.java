package service;

import java.util.List;

import model.BaseModel;
import sort.SortParams;

public interface BaseService<T extends BaseModel> {
	boolean create(T entity);
	boolean delete (T entity);
	boolean update (T entity);
	T get (Long id);
	List<T> getAll(SortParams params);

}
