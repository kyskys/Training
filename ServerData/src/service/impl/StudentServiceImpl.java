package service.impl;

import java.util.List;

import dao.BaseDAO;
import dao.CourseDAO;
import dao.StudentDAO;
import dependency.DependencyManager;
import service.StudentService;
import sort.SortParams;
import model.Course;
import model.Student;

public class StudentServiceImpl extends BaseServiceImpl<Student> implements
		StudentService {
	private CourseDAO courseDAO = DependencyManager
			.getInstance(CourseDAO.class);
	private StudentDAO studentDAO = DependencyManager
			.getInstance(StudentDAO.class);

	@Override
	protected BaseDAO<Student> getBaseDAO() {
		return studentDAO;
	}

	@Override
	public void addCourseToStudent(Long idStudent, Long idCourse) {
		Student student = studentDAO.get(idStudent);
		Course course = courseDAO.get(idCourse);
		student.setCourse(course);
		if (!course.getStudents().contains(student)) {
			course.getStudents().add(student);
		}
	}

	@Override
	public void deleteCourseFromStudent(Long idStudent, Long idCourse) {
		Student student = studentDAO.get(idStudent);
		Course course = courseDAO.get(idCourse);
		course.deleteStudent(student);
		student.setCourse(null);
	}

	@Override
	public void sort(SortParams params, List<Student> list) {

	}
}
