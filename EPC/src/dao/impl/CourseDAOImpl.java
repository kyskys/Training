package dao.impl;

import dao.CourseDAO;
import model.Course;

public class CourseDAOImpl extends BaseDAOImpl<Course> implements CourseDAO {

	private static CourseDAOImpl instance;
	private CourseDAOImpl() {
	}

	/*
	 * @Override public void showDescription(Long id) { Course course = get(id);
	 * System.out.println("information:" + course.getInformationOfCourse() +
	 * "\n" + "lector:" + course.getLector().getName() + "\n" + "students:"); //
	 *  }
	 */

	public static CourseDAOImpl getInstance() {
		if (instance == null) {
			return new CourseDAOImpl();
		}
		return instance;
	}
}
