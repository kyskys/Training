package storage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.*;

@SuppressWarnings("unchecked")
public class StorageDAO {
	private static long id;
	private static List<Object> list;
	private static List<Course> courseService = (List<Course>) list.get(0);
	private static List<Lector> lectorService = (List<Lector>) list.get(1);
	private static List<Lection> lectionService = (List<Lection>) list.get(2);
	private static List<Student> studentService = (List<Student>) list.get(3);
	static {recountId(courseService,lectorService,lectionService,studentService);}
	public static long setId() {
		return ++id;
	}

	public static void recountId(List<BaseModel>... lists) {
		for (List<BaseModel> x : lists) {
			for (BaseModel y : x) {
				if (y.getId() > id) {
					id = y.getId();
				}
			}
		}
	}

	public static void save(String fileName) throws IOException {
		List<Object> list = new ArrayList<Object>();
		list.add(courseService);
		list.add(lectorService);
		list.add(lectionService);
		list.add(studentService);
		SerializeUtil.serializeObject(list, fileName);
	}

	@SuppressWarnings("unchecked")
	public static void load(String fileName) throws ClassNotFoundException,
			IOException {
		list = (List<Object>) SerializeUtil.deserializeObject(fileName);
	}

}
