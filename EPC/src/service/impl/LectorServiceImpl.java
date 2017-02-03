package service.impl;

import java.util.List;

import dao.BaseDAO;
import dao.CourseDAO;
import dao.LectorDAO;
import dao.impl.CourseDAOImpl;
import dao.impl.LectorDAOImpl;
import service.LectorService;
import sort.SortByName;
import sort.SortLectorByCourseCount;
import sort.SortParams;
import model.Course;
import model.Lector;

public class LectorServiceImpl extends BaseServiceImpl<Lector> implements
		LectorService {
	private CourseDAO courseDAO = CourseDAOImpl.getInstance();
	private LectorDAO lectorDAO = LectorDAOImpl.getInstance();

	@Override
	protected BaseDAO<Lector> getBaseDAO() {
		return lectorDAO;
	}

	@Override
	public void addCourseToLector(Long idLector, Long idCourse) {
		Lector lector = lectorDAO.get(idLector);
		Course course = courseDAO.get(idCourse);
		lector.getCourses().add(course);
		course.setLector(lector);
	}

	@Override
	public void deleteCourseFromLector(Long idLector, Long idCourse) {
		Lector lector = lectorDAO.get(idLector);
		Course course = courseDAO.get(idCourse);
		course.setLector(null);
		lector.getCourses().remove(course);
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
