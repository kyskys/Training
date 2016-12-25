package sort;

import java.util.Comparator;
import model.Lector;


public class SortLectorByCourseCount implements Comparator <Lector> {

	@Override
	public int compare(Lector l1, Lector l2) {
		int n1 = l1.getCourses().size();
		int n2 = l2.getCourses().size();
		return n1>n2?1:n1<n2?-1:0;
	}
	
}