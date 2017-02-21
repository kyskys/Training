package action.course;

import java.util.List;

import action.Action;
import annotation.Print;
import model.Course;
import resourses.DependencyManager;
import service.CourseService;
import util.ConsoleReader;

public class DeleteLectorFromCourse implements Action{

	@Override
	public void doAction() throws IllegalArgumentException, IllegalAccessException {
		CourseService cs = DependencyManager.getInstance(CourseService.class);
		List<Course> list = cs.getAll(null);
		Print.printList(list, Course.class);
		System.out.println("\nChoose course:");
		long n = ConsoleReader.readLongByConsole();
		Course c = cs.get(n);
		c.setLector(null);
	}

}
