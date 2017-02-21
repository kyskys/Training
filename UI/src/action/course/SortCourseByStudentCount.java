package action.course;

import java.util.List;

import action.Action;
import annotation.Print;
import model.Course;
import resourses.DependencyManager;
import service.CourseService;
import sort.SortParams;

public class SortCourseByStudentCount implements Action{

	@Override
	public void doAction() throws IllegalArgumentException, IllegalAccessException {
		CourseService cs = DependencyManager.getInstance(CourseService.class);
		List<Course> list = cs.getAll(SortParams.STUDENTS_COUNT);
		Print.printList(list, Course.class);
	}

}
