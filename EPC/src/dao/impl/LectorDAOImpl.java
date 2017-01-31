package dao.impl;

import sort.*;
import dao.LectorDAO;
import model.Lector;

public class LectorDAOImpl extends BaseDAOImpl<Lector> implements LectorDAO {

	private static LectorDAOImpl instance;

	@Override
	public void sort(SortParams params) {
		if (params != null) {
			switch (params) {
			case NAME: {
				list.sort(new SortByName());
				break;
			}
			case COURSE_COUNT: {
				list.sort(new SortLectorByCourseCount());
				break;
			}
			default:
				break;
			}
		}
	}

	public static LectorDAOImpl getInstance() {
		if (instance == null) {
			return new LectorDAOImpl();
		}
		return instance;
	}
}
