package action.student;

import java.util.List;

import action.Action;
import annotation.Print;
import model.Course;
import model.Student;
import resourses.DependencyManager;
import service.CourseService;
import service.LectorService;
import service.StudentService;
import util.ConsoleReader;

public class AddCourseToStudent implements Action{

	@Override
	public void doAction() throws IllegalArgumentException, IllegalAccessException {
		CourseService cs = DependencyManager.getInstance(CourseService.class);
		List<Course> list1 = cs.getAll(null);
		StudentService ss = DependencyManager.getInstance(StudentService.class);
		List<Student> list2 = ss.getAll(null);
		Print.printList(list2, Student.class);
		System.out.println("choose student:");
		long n = ConsoleReader.readLongByConsole();
		Print.printList(list1, Course.class);
		System.out.println("Choose course to add:");
		long q = ConsoleReader.readLongByConsole();
		ss.addCourseToStudent(n, q);
	}

}
