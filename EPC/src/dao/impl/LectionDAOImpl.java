package dao.impl;

import java.util.List;

import sort.*;
import dao.LectionDAO;
import model.Lection;

public class LectionDAOImpl extends BaseDAOImpl<Lection> implements LectionDAO {

	@Override
	protected void sort(List<Lection> list, SortParams params) {
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
	 * super.getAll(null); // можно ли здесь null использовать, //чтобы вызвать
	 * getAll по дефолту? for (Lection lec : list) { if
	 * (lec.getDate().equals(date)) System.out.println(lec.getName()); } }
	 */
}
