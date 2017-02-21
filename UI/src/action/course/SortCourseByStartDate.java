package action.course;

import java.util.List;

import action.Action;
import annotation.Print;
import model.Course;
import resourses.DependencyManager;
import service.CourseService;
import sort.SortParams;

public class SortCourseByStartDate implements Action{

	@Override
	public void doAction() throws IllegalArgumentException, IllegalAccessException {
		CourseService cs = DependencyManager.getInstance(CourseService.class);
		List<Course> list = cs.getAll(SortParams.START_DATE);
		Print.printList(list, Course.class);
	}

}
