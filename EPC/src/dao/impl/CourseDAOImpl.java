package dao.impl;

import storage.StorageDAO;
import dao.CourseDAO;
import model.Course;

public class CourseDAOImpl extends BaseDAOImpl<Course> implements CourseDAO {
	{
		list = StorageDAO.courseService;
	}
}
