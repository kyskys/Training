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
		if (!course.getStudents().contains(student)) { //это проверка есть ли студент (в случае когда мы хотим изменить у студента курс)
			course.getStudents().add(student);
		}
	}

	@Override
	public void deleteCourseFromStudent(Long idStudent) {
		Student student = studentDAO.get(idStudent);
		Course course = courseDAO.get(student.getCourse().getId()); //вот здесь я делаю удаление студента у курса, правильно ли?
		course.getLections().remove(student);	//не проще ли было бы делать это через параметр?
		student.setCourse(null);
	}

}
