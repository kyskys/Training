package service;

import java.util.Date;
import java.util.List;

import sort.DateType;
import model.Course;

public interface CourseService extends BaseService<Course> {
	void addStudentToCourse(Long idStudent, Long idCourse);

	void deleteStudentFromCourse(Long idStudent, Long idCourse);

	void addLectorToCourse(Long idLector, Long idCourse);

	void deleteLectorFromCourse(Long idLector, Long idCourse);

	void addLectionToCourse(Long idLection, Long idCourse);

	void deleteLectionFromCourse(Long idLection, Long idCourse);

	List<Course> ListCourseWithDate(Date date, DateType dp);
}
