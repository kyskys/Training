package annotation;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import model.BaseModel;

class SortByOrder implements Comparator<FieldInfo> {

	@Override
	public int compare(FieldInfo o1, FieldInfo o2) {
		int n1 = o1.print.order();
		int n2 = o2.print.order();
		return n1 > n2 ? 1 : n1 < n2 ? -1 : 0;
	}
}

class FieldInfo {
	Field field;
	PrintableField print;

	public FieldInfo(Field field, PrintableField print) {
		this.field = field;
		this.print = print;
	}
}

public class Print<T extends BaseModel> {

	@SuppressWarnings("unchecked")
	public static <T> void printList(List<T> list, Class<T> c) throws IllegalArgumentException, IllegalAccessException {
		if (c.isAnnotationPresent(PrintableModel.class)) {
			System.out.println("List of " + c.getAnnotation(PrintableModel.class).name());
			Class<T> clazz = c;
			List<FieldInfo> lf = new ArrayList<FieldInfo>();
			while (clazz != Object.class) {
				Field[] fields = clazz.getDeclaredFields();
				for (Field f : fields) {
					if (f.isAnnotationPresent(PrintableField.class)) {
						f.setAccessible(true);
						lf.add(new FieldInfo(f, f.getAnnotation(PrintableField.class)));
					}
				}
				clazz = (Class<T>) clazz.getSuperclass();
			}
			lf.sort(new SortByOrder());
			for (FieldInfo fi : lf) {
				System.out.print(fi.print.name() + "	");
			}
			System.out.println();
			for (T x : list) {
				for (FieldInfo fi : lf) {
					System.out.print(fi.field.get(x) + "	");
				}
				System.out.println();
			}
		}
	}
}
