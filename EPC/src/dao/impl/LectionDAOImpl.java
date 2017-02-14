package dao.impl;

import storage.StorageDAO;
import dao.LectionDAO;
import model.Lection;

public class LectionDAOImpl extends BaseDAOImpl<Lection> implements LectionDAO {
	{
		list = StorageDAO.lectionService;
	}
}
