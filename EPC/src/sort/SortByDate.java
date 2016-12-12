package sort;

import java.util.Comparator;
import java.util.Date;
import model.Course;
import model.Lection;


public class SortByDate implements Comparator <Course> {

	@Override
	public int compare(Course c1, Course c2) {
		Date d1 = c1.getLections()[0].getDate();
		Date d2 = c2.getLections()[0].getDate();
		return d1.compareTo(d2);
	}
	
	public int compare(Lection l1, Lection l2) {
		Date d1 = l1.getDate();
		Date d2 = l2.getDate();
		return d1.compareTo(d2);
	}
}
