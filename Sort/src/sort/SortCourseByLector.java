package sort;

import java.util.Comparator;

import model.Course;

public class SortCourseByLector implements Comparator<Course> {

	@Override
	public int compare(Course o1, Course o2) {
		String str1 = o1.getLector().getName();
		String str2 = o2.getLector().getName();
		return str1.compareTo(str2);
	}
}