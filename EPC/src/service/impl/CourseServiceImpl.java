package service.impl;

import dao.BaseDAO;
import dao.CourseDAO;
import dao.LectionDAO;
import dao.LectorDAO;
import dao.StudentDAO;
import dao.impl.CourseDAOImpl;
import dao.impl.LectionDAOImpl;
import dao.impl.LectorDAOImpl;
import dao.impl.StudentDAOImpl;
import service.CourseService;
import model.Course;
import model.Lection;
import model.Lector;
import model.Student;

public class CourseServiceImpl extends BaseServiceImpl<Course> implements
		CourseService {
	// TODO все методы умеют только возвращать (строку), а не писать в консоль
	private CourseDAO courseDAO = CourseDAOImpl.getInstance();
	private StudentDAO studentDAO = StudentDAOImpl.getInstance();
	private LectorDAO lectorDAO = LectorDAOImpl.getInstance();
	private LectionDAO lectionDAO = LectionDAOImpl.getInstance();

	@Override
	protected BaseDAO<Course> getBaseDAO() {
		return courseDAO;
	}

	@Override
	public void addStudentToCourse(Long idStudent, Long idCourse) {
		Student student = studentDAO.get(idStudent);
		Course course = courseDAO.get(idCourse);
		student.setCourse(course);
		course.getStudents().add(student);
	}

	@Override
	public void deleteStudentFromCourse(Long idStudent, Long idCourse) {
		Student student = studentDAO.get(idStudent);
		Course course = courseDAO.get(idCourse);
		student.setCourse(null);
		course.getStudents().remove(student);
	}

	@Override
	public void addLectorToCourse(Long idLector, Long idCourse) {
		Lector lector = lectorDAO.get(idLector);
		Course course = courseDAO.get(idCourse);
		lector.getCourses().add(course);
		course.setLector(lector);
	}
	
	@Override
	public void deleteLectorFromCourse(Long idLector, Long idCourse) {
		Lector lector = lectorDAO.get(idLector);
		Course course = courseDAO.get(idCourse); // вот здесь я делаю удаление
													// студента у курса,
													// правильно ли?
		course.getLections().remove(lector);
		lector.getCourses().remove(course);
	}

	@Override
	public void addLectionToCourse(Long idLection, Long idCourse) {
		Lection lection = lectionDAO.get(idLection);
		Course course = courseDAO.get(idCourse);
		lection.setCourse(course);
		course.getLections().add(lection);
	}

	@Override
	public void deleteLectionFromCourse(Long idLection, Long idCourse) {
		Lection lection = lectionDAO.get(idLection);
		Course course = courseDAO.get(idCourse);
		lection.setCourse(null);
		course.getLections().remove(lection);
	}

}
