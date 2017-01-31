package service.impl;

import dao.BaseDAO;
import dao.CourseDAO;
import dao.StudentDAO;
import dao.impl.CourseDAOImpl;
import dao.impl.StudentDAOImpl;
import service.StudentService;
import model.Course;
import model.Student;

public class StudentServiceImpl extends BaseServiceImpl<Student> implements
		StudentService {
	private CourseDAO courseDAO = new CourseDAOImpl();
	private StudentDAO studentDAO = new StudentDAOImpl();

	@Override
	protected BaseDAO<Student> getBaseDAO() {
		return studentDAO;
	}

	@Override
	public void addCourseToStudent(Long idStudent, Long idCourse) {
		Student student = studentDAO.get(idStudent);
		Course course = courseDAO.get(idCourse);
		student.setCourse(course);
		if (!course.getStudents().contains(student)) { //��� �������� ���� �� ������� (� ������ ����� �� ����� �������� � �������� ����)
			course.getStudents().add(student);
		}
	}

	@Override
	public void deleteCourseFromStudent(Long idStudent) {
		Student student = studentDAO.get(idStudent);
		Course course = courseDAO.get(student.getCourse().getId()); //��� ����� � ����� �������� �������� � �����, ��������� ��?
		course.getLections().remove(student);	//�� ����� �� ���� �� ������ ��� ����� ��������?
		student.setCourse(null);
	}

}
