package dao.impl;

import java.util.List;

import sort.*;
import dao.CourseDAO;
import model.Course;

public class CourseDAOImpl extends BaseDAOImpl<Course> implements CourseDAO {
	@Override
	protected void sort(List<Course> list, SortParams params) {
		if (params != null) {
			switch (params) {
			case NAME: {
				list.sort(new SortByName());
				break;
			}
			case STUDENTS_COUNT: {
				list.sort(new SortCourseByStudentsCount());
				break;
			}
			case DATE: {
				list.sort(new SortCourseByStartDate());
			}
			default:
				break;
			}
		}
	}

	/*
	 * @Override public void showDescription(Long id) { Course course = get(id);
	 * System.out.println("information:" + course.getInformationOfCourse() +
	 * "\n" + "lector:" + course.getLector().getName() + "\n" + "students:"); //
	 * TODO как вывести список студентов не использу€ импл студентов }
	 */

	@Override
	public CourseDAOImpl getInstance() {
		if (instance == null) {
			return new CourseDAOImpl();
		}
			return (CourseDAOImpl) instance;
	}
}
