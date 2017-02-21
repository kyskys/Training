package action.lection;

import java.util.List;

import action.Action;
import annotation.Print;
import model.Course;
import model.Lection;
import model.Lector;
import resourses.DependencyManager;
import service.CourseService;
import service.LectionService;
import service.LectorService;
import util.ConsoleReader;

public class AddCourseToLection implements Action{

	@Override
	public void doAction() throws IllegalArgumentException, IllegalAccessException {
		CourseService cs = DependencyManager.getInstance(CourseService.class);
		List<Course> list1 = cs.getAll(null);
		LectionService ls = DependencyManager.getInstance(LectionService.class);
		List<Lection> list2 = ls.getAll(null);
		Print.printList(list2, Lection.class);
		System.out.println("\nChoose lection:");
		long n = ConsoleReader.readLongByConsole();
		Lection l = ls.get(n);
		Print.printList(list1, Course.class);
		System.out.println("\nChoose course to add:");
		n = ConsoleReader.readLongByConsole();
		Course c = cs.get(n);
		l.setCourse(c);
	}

}
