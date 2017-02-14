package action;

import resourses.DependencyManager;
import service.*;

public class TotalCount implements Action {
	@Override
	public void doAction() {
		CourseService courses = DependencyManager
				.getInstance(CourseService.class);
		LectorService lectors = DependencyManager
				.getInstance(LectorService.class);
		LectionService lections = DependencyManager
				.getInstance(LectionService.class);
		StudentService students = DependencyManager
				.getInstance(StudentService.class);
		System.out.println("course:" + courses.totalCount()
				+ " lector:" + lectors.totalCount() + " lection:"
				+ lections.totalCount() + " student:" + students.totalCount());
	}
}
