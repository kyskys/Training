package sort;

import java.lang.reflect.Field;
import java.util.Comparator;

import annotation.PrintableField;

public class SortByOrder implements Comparator<Field> {

	@Override
	public int compare(Field o1, Field o2) {
		int n1 = o1.getAnnotation(PrintableField.class).order();
		int n2 = o2.getAnnotation(PrintableField.class).order();
		return n1 > n2 ? 1 : n1 < n2 ? -1 : 0;
	}
}
