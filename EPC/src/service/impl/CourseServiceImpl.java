package service.impl;

import dao.BaseDAO;
import dao.CourseDAO;
import dao.StudentDAO;
import dao.impl.CourseDAOImpl;
import dao.impl.StudentDAOImpl;
import service.CourseService;
import model.Course;
import model.Lector;
import model.Student;

public class CourseServiceImpl extends BaseServiceImpl<Course> implements
		CourseService {
	// TODO ��� ������ ����� ������ ���������� (������), � �� ������ � �������
	private CourseDAO courseDAO = new CourseDAOImpl();
	private StudentDAO studentDAO = new StudentDAOImpl();

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
	public void addCourseToLector(Long idLector, Long idCourse) {
		Lector lector = lectorDAO.get(idLector);
		Course course = courseDAO.get(idCourse);
		lector.getCourses().add(course);
		course.setLector(lector);
	}

	@Override
	public void deleteCourseFromLector(Long idLector, Long idCourse) {
		Lector lector = lectorDAO.get(idLector);
		Course course = courseDAO.get(idCourse); //��� ����� � ����� �������� �������� � �����, ��������� ��?
		course.getLections().remove(lector);
		lector.getCourses().remove(course);
	}

}
