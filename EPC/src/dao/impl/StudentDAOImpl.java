package dao.impl;

import dao.StudentDAO;
import model.Student;

public class StudentDAOImpl extends BaseDAOImpl<Student> implements StudentDAO {

	private static StudentDAOImpl instance;

	private StudentDAOImpl() {
	}

	public static StudentDAOImpl getInstance() {
		if (instance == null) {
			return new StudentDAOImpl();
		}
		return instance;
	}

}
