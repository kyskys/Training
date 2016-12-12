package sort;

import java.util.Comparator;

import model.Abstract;


public class SortByName implements Comparator <Abstract> {

	@Override
	public int compare(Abstract o1, Abstract o2) {
		String str1 = o1.getName();
		String str2 = o2.getName();
		return str1.compareTo(str2);
	}
	


}
