package dao.impl;

import java.util.List;

import sort.SortParams;
import dao.StudentDAO;
import model.Student;

public class StudentDAOImpl extends BaseDAOImpl<Student> implements StudentDAO {

	private static StudentDAOImpl instance;

	@Override
	public void sort(List<Student> list, SortParams params) {

	}

	public static StudentDAOImpl getInstance() {
		if (instance == null) {
			return new StudentDAOImpl();
		}
		return instance;
	}

}
