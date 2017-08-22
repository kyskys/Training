package action.lection;

import java.util.List;

import action.Action;
import annotation.Print;
import model.Course;
import model.Lection;
import resourses.DependencyManager;
import service.CourseService;
import service.LectionService;
import util.ConsoleReader;

public class DeleteCourseFromLection implements Action{

	@Override
	public void doAction() throws IllegalArgumentException, IllegalAccessException {
		LectionService ls = DependencyManager.getInstance(LectionService.class);
		List<Lection> list1 = ls.getAll(null);
		CourseService cs = DependencyManager.getInstance(CourseService.class);
		List<Course> list2 = cs.getAll(null);
		Print.printList(list1, Lection.class);
		System.out.println("choose lection:");
		long n = ConsoleReader.readLongByConsole();
		Print.printList(list2, Course.class);
		System.out.println("choose course to delete:");
		long q = ConsoleReader.readLongByConsole();
		ls.deleteLectionFromCourse(n, q);
	}

}
