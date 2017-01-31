package service.impl;

import dao.BaseDAO;
import dao.CourseDAO;
import dao.LectorDAO;
import dao.impl.CourseDAOImpl;
import dao.impl.LectorDAOImpl;
import service.LectorService;
import model.Course;
import model.Lector;

public class LectorServiceImpl extends BaseServiceImpl<Lector> implements
		LectorService {
	private CourseDAO courseDAO = new CourseDAOImpl();
	private LectorDAO lectorDAO = new LectorDAOImpl();

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
		Course course = courseDAO.get(idCourse); //вот здесь я делаю удаление студента у курса, правильно ли?
		course.getLections().remove(lector);
		lector.getCourses().remove(course);
	}

}
