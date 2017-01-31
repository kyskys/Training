package sort;

import java.util.Comparator;
import java.util.Date;
import model.Course;

public class SortCourseByStartDate implements Comparator<Course> {

	@Override
	public int compare(Course c1, Course c2) {
		Date d1 = c1.getLections().get(0).getDate();
		Date d2 = c2.getLections().get(0).getDate();
		return d1.compareTo(d2);
	}

}
