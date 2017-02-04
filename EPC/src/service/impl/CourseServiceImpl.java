package service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
import sort.DateType;
import sort.SortByName;
import sort.SortCourseByStartDate;
import sort.SortCourseByStudentsCount;
import sort.SortParams;
import model.Course;
import model.Lection;
import model.Lector;
import model.Student;

public class CourseServiceImpl extends BaseServiceImpl<Course> implements
		CourseService {
	private CourseDAO courseDAO = getConfig().getProperty("dao.CourseDAO");
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
		Course course = courseDAO.get(idCourse); 
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

	@Override
	public List<Course> ListCourseWithDate(Date date, DateType dp) {
		List<Course> l = new ArrayList<Course>();
		if (dp != null) {
			switch (dp) {
			case BEFORE: {
				for (Course c : courseDAO.getAll()) {
					if (c.getLections().get(0).getDate().before(date)) {
						l.add(c);
					}
				}
			}
			case AFTER: {
				for (Course c : courseDAO.getAll()) {
					if (c.getLections().get(0).getDate().after(date)) {
						l.add(c);
					}
				}
			}
			}
		}
		return l;
	}

	@Override
	public void sort(SortParams params, List<Course> list) {
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
}
