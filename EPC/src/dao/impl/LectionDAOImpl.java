package dao.impl;

import sort.*;
import dao.LectionDAO;
import model.Lection;

public class LectionDAOImpl extends BaseDAOImpl<Lection> implements LectionDAO {

	private static LectionDAOImpl instance;

	@Override
	public void sort(SortParams params) {
		if (params != null) {
			switch (params) {
			case NAME: {
				list.sort(new SortByName());
				break;
			}
			case DATE: {
				list.sort(new SortLectionByDate());
				break;
			}
			default:
				break;
			}
		}

	}

	/*
	 * @Override public void showLectionByDate(Date date) { List<Lection> list =
	 * super.getAll(null); 
	 * for (Lection lec : list) { if
	 * (lec.getDate().equals(date)) System.out.println(lec.getName()); } }
	 */

	public static LectionDAOImpl getInstance() {
		if (instance == null) {
			return new LectionDAOImpl();
		}
		return instance;
	}
}
