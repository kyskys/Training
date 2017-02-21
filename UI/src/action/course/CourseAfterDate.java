package action.course;

import java.util.Date;
import java.util.List;

import action.Action;
import annotation.Print;
import model.Course;
import resourses.DependencyManager;
import service.CourseService;
import sort.DateType;
import sort.SortParams;
import util.ConsoleReader;

public class CourseAfterDate implements Action{

	@Override
	public void doAction() throws IllegalArgumentException, IllegalAccessException {
		CourseService cs = DependencyManager.getInstance(CourseService.class);
		Date date = ConsoleReader.readDateByConsole();
		List<Course> list = cs.ListCourseWithDate(date, DateType.AFTER);
		Print.printList(list, Course.class);
	}

}
