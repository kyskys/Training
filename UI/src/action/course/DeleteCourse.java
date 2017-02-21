package action.course;

import java.util.List;

import model.BaseModel;
import model.Course;
import resourses.DependencyManager;
import service.CourseService;
import util.ConsoleReader;
import action.Action;
import annotation.Print;

public class DeleteCourse implements Action {

	@Override
	public void doAction() throws IllegalArgumentException, IllegalAccessException {
		CourseService cs = DependencyManager.getInstance(CourseService.class);
		List<Course> list = cs.getAll(null);
		Print.printList(list, Course.class);
		System.out.println("\nchoose id for deleting:");
		long n = ConsoleReader.readLongByConsole();
		cs.delete(cs.get(n));

	}
}
