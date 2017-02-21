package action.course;

import model.Course;
import resourses.DependencyManager;
import service.CourseService;
import util.ConsoleReader;
import action.Action;

public class CreateCourse implements Action {
	@Override
	public void doAction() {
		CourseService cs = DependencyManager.getInstance(CourseService.class);
		Course c = new Course();
		System.out.println("type name of course:");
		String name = ConsoleReader.readStringByConsole();
		System.out.println("type information about course:");
		String info = ConsoleReader.readStringByConsole();
		c.setName(name);
		c.setInformationOfCourse(info);
		cs.create(c);
	}
}
