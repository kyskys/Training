package action.course;

import java.util.List;

import action.Action;
import annotation.Print;
import model.Course;
import model.Lector;
import resourses.DependencyManager;
import service.CourseService;
import service.LectorService;
import util.ConsoleReader;

public class AddLectorToCourse implements Action{

	@Override
	public void doAction() throws IllegalArgumentException, IllegalAccessException {
		CourseService cs = DependencyManager.getInstance(CourseService.class);
		List<Course> list1 = cs.getAll(null);
		LectorService ls = DependencyManager.getInstance(LectorService.class);
		List<Lector> list2 = ls.getAll(null);
		Print.printList(list1, Course.class);
		System.out.println("\nChoose course:");
		long n = ConsoleReader.readIntByConsole();
		Course c = cs.get(n);
		Print.printList(list2, Lector.class);
		System.out.println("\nChoose lector to add:");
		n = ConsoleReader.readIntByConsole();
		Lector l = ls.get(n);
		c.setLector(l);
	}

}
