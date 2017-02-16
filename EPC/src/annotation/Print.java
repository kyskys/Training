package annotation;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import model.BaseModel;

/*class qwe {
	Field field;
	PrintableField model;
	public qwe(Field field, PrintableField model) {
		this.field = field;
		this.model = model;
	}
}*/
public class Print<T extends BaseModel> {

	@SuppressWarnings("unchecked")
	public static <T> void printList(Class<T> c) throws NoSuchFieldException,
			SecurityException {
		if (c.isAnnotationPresent(PrintableModel.class)) {
			System.out.println("List of "
					+ c.getAnnotation(PrintableModel.class).name());
			List<Field> lf = new ArrayList<Field>();
			while (c != Object.class) {
				Field[] fields = c.getDeclaredFields();
				for (Field f : fields) {
					if (f.isAnnotationPresent(PrintableField.class)) {
						lf.add(f);
					}
				}
				c = (Class<T>) c.getSuperclass();
			}
			lf.sort(new sort.SortByOrder());
			System.out.println(lf.get(0).getAnnotation(PrintableField.class)
					.name()
					+ ", "
					+ lf.get(1).getAnnotation(PrintableField.class).name());
		}
	}
}

