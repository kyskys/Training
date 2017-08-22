package service.impl;

import java.util.List;

import dao.BaseDAO;
import dao.CourseDAO;
import dao.LectorDAO;
import dependency.DependencyManager;
import service.LectorService;
import sort.SortByName;
import sort.SortLectorByCourseCount;
import sort.SortParams;
import model.Course;
import model.Lector;

public class LectorServiceImpl extends BaseServiceImpl<Lector> implements
		LectorService {
	private CourseDAO courseDAO = DependencyManager
			.getInstance(CourseDAO.class);
	private LectorDAO lectorDAO = DependencyManager
			.getInstance(LectorDAO.class);

	@Override
	protected BaseDAO<Lector> getBaseDAO() {
		return lectorDAO;
	}

	@Override
	public void addCourseToLector(Long idLector, Long idCourse) {
		Lector lector = lectorDAO.get(idLector);
		Course course = courseDAO.get(idCourse);
		lector.addCourse(course);
		course.setLector(lector);
	}

	@Override
	public void deleteCourseFromLector(Long idLector, Long idCourse) {
		Lector lector = lectorDAO.get(idLector);
		Course course = courseDAO.get(idCourse);
		course.setLector(null);
		lector.deleteCourse(course);
	}

	@Override
	public void sort(SortParams params, List<Lector> list) {
		if (params != null) {
			switch (params) {
			case NAME: {
				list.sort(new SortByName());
				break;
			}
			case COURSE_COUNT: {
				list.sort(new SortLectorByCourseCount());
				break;
			}
			default:
				break;
			}
		}
	}
}
