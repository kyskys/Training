package action.course;

import java.util.List;

import model.Course;
import resourses.DependencyManager;
import service.CourseService;
import util.ConsoleReader;
import action.Action;

public class DeleteCourse implements Action {

	@Override
	public void doAction() {
		CourseService cs = DependencyManager.getInstance(CourseService.class);
		List<Course> list = cs.getAll(null);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ". " + list.get(i) + ", id = " + list.get(i).getId()
					+ "\n");
		}
		System.out.println("\nviberite id dlya ydaleniya");
		int n = ConsoleReader.readIntByConsole();
		cs.delete(cs.get((long)n));

	}
}
