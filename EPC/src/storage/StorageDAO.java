package storage;

import java.util.List;

import model.*;
import dao.*;
import resourses.DependencyManager;

public class StorageDAO {
	private long id =
	private List<Course> courses = DependencyManager.getInstance(
			CourseDAO.class).getAll();
	private List<Lector> lectors = DependencyManager.getInstance(
			LectorDAO.class).getAll();
	private List<Lection> lections = DependencyManager.getInstance(
			LectionDAO.class).getAll();
	private List<Student> students = DependencyManager.getInstance(
			StudentDAO.class).getAll();
	public long getId() {
		return ++id;
	}
}
