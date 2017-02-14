package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import resourses.DependencyManager;
import service.CourseService;
import service.LectionService;
import service.LectorService;
import service.StudentService;
import util.Controller;
import util.MenuBuilder;
import util.SerializeUtil;
import menu.Menu;
import model.Course;
import model.Lection;
import model.Lector;
import model.Student;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//SerializeUtil.deserializeObject("file.txt");
		Menu m = MenuBuilder.buildMenu();
		Controller.start(m);
		List<Course> courses = DependencyManager.getInstance(CourseService.class).getAll(null);
		List<Lector> lectors = DependencyManager.getInstance(LectorService.class).getAll(null);
		List<Lection> lections = DependencyManager.getInstance(LectionService.class).getAll(null);
		List<Student> students = DependencyManager.getInstance(StudentService.class).getAll(null);
		List<Object> list = new ArrayList<Object>();
		list.add(courses);
		list.add(lectors);
		list.add(lections);
		list.add(students);
		SerializeUtil.serializeObject(list, "file.txt");
		
	}

}
