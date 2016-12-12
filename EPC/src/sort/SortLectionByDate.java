package sort;

import java.util.Date;
import java.util.Comparator;

import model.Lection;

public class SortLectionByDate implements Comparator<Lection>{
	
	@Override
	public int compare(Lection l1, Lection l2) {
		Date d1 = l1.getDate();
		Date d2 = l2.getDate();
		return d1.compareTo(d2);
	}

}
