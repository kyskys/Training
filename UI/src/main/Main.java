package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import resourses.DependencyManager;
import service.CourseService;
import service.LectionService;
import service.LectorService;
import service.StudentService;
import storage.StorageDAO;
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
		StorageDAO.load("file.txt");
		Menu m = MenuBuilder.buildMenu();
		Controller.start(m);
		StorageDAO.save("file.txt");
		
	}

}
