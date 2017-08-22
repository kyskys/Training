package dao.impl;

import storage.StorageDAO;
import dao.LectorDAO;
import model.Lector;

public class LectorDAOImpl extends BaseDAOImpl<Lector> implements LectorDAO {
	{
		list = StorageDAO.lectorService;
	}
}
