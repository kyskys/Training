package dao.impl;

import dao.LectionDAO;
import model.Lection;
import serializer.Serializer;

public class LectionDAOImpl extends BaseDAOImpl<Lection> implements LectionDAO {
	{
		list = Serializer.lectionService;
	}
}
