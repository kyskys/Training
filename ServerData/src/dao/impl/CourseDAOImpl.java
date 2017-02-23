package dao.impl;

import dao.CourseDAO;
import model.Course;
import serializer.Serializer;

public class CourseDAOImpl extends BaseDAOImpl<Course> implements CourseDAO {
	{
		list = Serializer.courseService;
	}
}
