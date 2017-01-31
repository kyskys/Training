package dao.impl;

import java.util.List;

import sort.*;
import dao.LectorDAO;
import model.Lector;

public class LectorDAOImpl extends BaseDAOImpl<Lector> implements LectorDAO {
	
	@Override
	protected void sort(List<Lector> list, SortParams params) {
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
}
