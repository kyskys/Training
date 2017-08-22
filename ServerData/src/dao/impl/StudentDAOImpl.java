package dao.impl;

import dao.StudentDAO;
import model.Student;
import serializer.Serializer;

public class StudentDAOImpl extends BaseDAOImpl<Student> implements StudentDAO {
	{
		list = Serializer.studentService;
	}
}
