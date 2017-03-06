package facade;

import java.util.Date;
import java.util.List;

import model.*;
import dependency.DependencyManager;
import service.*;
import sort.DateType;
import sort.SortParams;

public class Facade {
	CourseService courseService = DependencyManager
			.getInstance(CourseService.class);
	LectorService lectorService = DependencyManager
			.getInstance(LectorService.class);
	LectionService lectionService = DependencyManager
			.getInstance(LectionService.class);
	StudentService studentService = DependencyManager
			.getInstance(StudentService.class);

	public void createCourse(Course entity) {
		courseService.create(entity);
	}

	public void deleteCourse(Course entity) {
		courseService.delete(entity);
	}

	public void updateCourse(Course entity) {
		courseService.update(entity);
	}

	public Course getCourse(Long id) {
		return courseService.get(id);
	}

	public List<Course> getAllCourses(SortParams params) {
		return courseService.getAll(params);
	}

	public String getAllCoursesAsString() {
		return courseService.getAllAsString();
	}

	public int totalCourseCount() {
		return courseService.totalCount();
	}

	public void addStudentToCourse(Long idStudent, Long idCourse) {
		courseService.addStudentToCourse(idStudent, idCourse);
	}

	public void deleteStudentFromCourse(Long idStudent, Long idCourse) {
		courseService.deleteStudentFromCourse(idStudent, idCourse);
	}

	public void addLectorToCourse(Long idLector, Long idCourse) {
		courseService.addLectorToCourse(idLector, idCourse);
	}

	public void deleteLectorFromCourse(Long idLector, Long idCourse) {
		courseService.deleteLectorFromCourse(idLector, idCourse);
	}

	public void addLectionToCourse(Long idLection, Long idCourse) {
		courseService.addLectionToCourse(idLection, idCourse);
	}

	public void deleteLectionFromCourse(Long idLection, Long idCourse) {
		courseService.deleteLectionFromCourse(idLection, idCourse);
	}

	public List<Course> ListCourseWithDate(Date date, DateType dt) {
		return courseService.ListCourseWithDate(date, dt);
	}

	public void createLection(Lection entity) {
		lectionService.create(entity);
	}

	public void deleteLection(Lection entity) {
		lectionService.delete(entity);
	}

	public void updateLection(Lection entity) {
		lectionService.update(entity);
	}

	public Lection getLection(Long id) {
		return lectionService.get(id);
	}

	public List<Lection> getAllLections(SortParams params) {
		return lectionService.getAll(params);
	}

	public String getAllLectionsAsString() {
		return lectionService.getAllAsString();
	}

	public int totalLectionCount() {
		return lectionService.totalCount();
	}

	public void addCourseToLection(Long idLection, Long idCourse) {
		lectionService.addLectionToCourse(idLection, idCourse);
	}

	public void deleteCourseFromLection(Long idLection, Long idCourse) {
		lectionService.deleteLectionFromCourse(idLection, idCourse);
	}

	public List<Lection> ListOfLectionsOnDate(Date date) {
		return lectionService.ListOfLectionsOnDate(date);
	}

	public void createLector(Lector entity) {
		lectorService.create(entity);
	}

	public void deleteLector(Lector entity) {
		lectorService.delete(entity);
	}

	public void updateLector(Lector entity) {
		lectorService.update(entity);
	}

	public Lector getLector(Long id) {
		return lectorService.get(id);
	}

	public List<Lector> getAllLectors(SortParams params) {
		return lectorService.getAll(params);
	}

	public String getAllLectorsAsString() {
		return lectorService.getAllAsString();
	}

	public int totalLectorCount() {
		return lectorService.totalCount();
	}

	public void addCourseToLector(Long idLector, Long idCourse) {
		lectorService.addCourseToLector(idLector, idCourse);
	}

	public void deleteCourseFromLector(Long idLector, Long idCourse) {
		lectorService.deleteCourseFromLector(idLector, idCourse);
	}

	public void createStudent(Student entity) {
		studentService.create(entity);
	}

	public void deleteStudent(Student entity) {
		studentService.delete(entity);
	}

	public void updateStudent(Student entity) {
		studentService.update(entity);
	}

	public Student getStudent(Long id) {
		return studentService.get(id);
	}

	public List<Student> getAllStudents(SortParams params) {
		return studentService.getAll(params);
	}

	public String getAllStudentsAsString() {
		return studentService.getAllAsString();
	}

	public int totalStudentCount() {
		return studentService.totalCount();
	}

	public void addCourseToStudent(Long idStudent, Long idCourse) {
		studentService.addCourseToStudent(idStudent, idCourse);
	}

	public void deleteCourseFromStudent(Long idStudent, Long idCourse) {
		studentService.deleteCourseFromStudent(idStudent, idCourse);
	}

}
