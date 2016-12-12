package test;

import java.sql.Date;
import java.util.ArrayList;

import util.Creator;
import model.Course;
import model.Lection;
import model.Lector;
import model.Student;

public class Test {

	public static void main(String[] args) {
		ArrayList<Lector> lectors = new ArrayList<Lector>();
		ArrayList<Student> students = new ArrayList<Student>();
		ArrayList<Lection> lections = new ArrayList<Lection>();
		ArrayList<Course> courses = new ArrayList<Course>();
		lectors.add(Creator.addLector("lektor"));
		students.add(Creator.addStudent("stydent"));
		lections.add(Creator.addLection("lekciya1", new Date(0)));
		courses.add(Creator.addCourse("kyrs1", "infa"));
	}

}
