package dao.impl;

import storage.StorageDAO;
import dao.StudentDAO;
import model.Student;

public class StudentDAOImpl extends BaseDAOImpl<Student> implements StudentDAO {
	{
		list = StorageDAO.studentService;
	}
}
