package service;

import model.Student;

public interface StudentService extends BaseService<Student> {
	void addCourseToStudent(Long idStudent, Long idCourse);

	void deleteCourseFromStudent(Long idStudent, Long idCourse);
}
