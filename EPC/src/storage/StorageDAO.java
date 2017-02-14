package storage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.*;

@SuppressWarnings("unchecked")
public class StorageDAO {
	private static long id;
	public static List<Course> courseService;
	public static List<Lector> lectorService;
	public static List<Lection> lectionService;
	public static List<Student> studentService;
	static {
		recountId(courseService, lectorService, lectionService, studentService);
	}

	public static long getId() {
		return ++id;
	}
	
	public static void recountId(List<? extends BaseModel>... lists) {
		for (List<? extends BaseModel> x : lists) {
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

	public static void load(String fileName) throws ClassNotFoundException,
			IOException {
		List<Object> list = (List<Object>) SerializeUtil.deserializeObject(fileName);
		courseService = (List<Course>) list.get(0);
		lectorService = (List<Lector>) list.get(1);
		lectionService = (List<Lection>) list.get(2);
		studentService = (List<Student>) list.get(3);
	}

}
