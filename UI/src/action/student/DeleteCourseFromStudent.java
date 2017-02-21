package action.student;

import java.util.List;

import action.Action;
import annotation.Print;
import model.Course;
import model.Lector;
import model.Student;
import resourses.DependencyManager;
import service.CourseService;
import service.LectorService;
import service.StudentService;
import util.ConsoleReader;

public class DeleteCourseFromStudent implements Action{

	@Override
	public void doAction() throws IllegalArgumentException, IllegalAccessException {
		StudentService ss = DependencyManager.getInstance(StudentService.class);
		List<Student> list = ss.getAll(null);
		Print.printList(list, Student.class);
		System.out.println("\nChoose student:");
		long n = ConsoleReader.readLongByConsole();
		Student s = ss.get(n);
		s.setCourse(null);
	}

}
