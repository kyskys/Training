package action.lector;

import java.util.List;

import action.Action;
import annotation.Print;
import model.Course;
import model.Lector;
import resourses.DependencyManager;
import service.CourseService;
import service.LectorService;
import util.ConsoleReader;

public class AddCourseToLector implements Action{

	@Override
	public void doAction() throws IllegalArgumentException, IllegalAccessException {
		CourseService cs = DependencyManager.getInstance(CourseService.class);
		List<Course> list1 = cs.getAll(null);
		LectorService ls = DependencyManager.getInstance(LectorService.class);
		List<Lector> list2 = ls.getAll(null);
		Print.printList(list1, Course.class);
		System.out.println("choose lector:");
		long n = ConsoleReader.readLongByConsole();
		Print.printList(list2, Lector.class);
		System.out.println("choose course to add:");
		long q = ConsoleReader.readLongByConsole();
		ls.addCourseToLector(n, q);
	}

}
