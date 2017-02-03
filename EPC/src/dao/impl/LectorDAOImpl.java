package dao.impl;

import dao.LectorDAO;
import model.Lector;

public class LectorDAOImpl extends BaseDAOImpl<Lector> implements LectorDAO {

	private static LectorDAOImpl instance;

	private LectorDAOImpl() {
	}

	public static LectorDAOImpl getInstance() {
		if (instance == null) {
			return new LectorDAOImpl();
		}
		return instance;
	}
}
