package dao.impl;

import java.util.List;

import sort.SortParams;
import dao.StudentDAO;
import model.Student;

public class StudentDAOImpl extends BaseDAOImpl<Student> implements StudentDAO {

	@Override
	public void sort(List<Student> list, SortParams params) {
		
	}

	@Override
	public StudentDAOImpl getInstance() {
		if (instance==null) {
			return new StudentDAOImpl();
		}
		return (StudentDAOImpl) instance;
	}

}
