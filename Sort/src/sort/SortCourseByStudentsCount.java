package sort;

import java.util.Comparator;

import model.Course;

public class SortCourseByStudentsCount implements Comparator<Course> {

	@Override
	public int compare(Course o1, Course o2) {
		int c1 = o1.getStudents().size();
		int c2 = o2.getStudents().size();
		return c1 > c2 ? 1 : c1 < c2 ? -1 : 0;
	}

}
