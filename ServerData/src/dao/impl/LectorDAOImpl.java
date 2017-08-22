package dao.impl;

import dao.LectorDAO;
import model.Lector;
import serializer.Serializer;

public class LectorDAOImpl extends BaseDAOImpl<Lector> implements LectorDAO {
	{
		list = Serializer.lectorService;
	}
}
