package dao.impl;

import sort.SortParams;
import dao.StudentDAO;
import model.Student;

public class StudentDAOImpl extends BaseDAOImpl<Student> implements StudentDAO {

	private static StudentDAOImpl instance;

	@Override
	public void sort(SortParams params) {

	}

	public static StudentDAOImpl getInstance() {
		if (instance == null) {
			return new StudentDAOImpl();
		}
		return instance;
	}

}
