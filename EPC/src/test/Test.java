package test;

import java.sql.Date;
import java.util.ArrayList;

import util.Creator;
import util.Helper;
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
		courses.get(0).setLections(lections);
		courses.get(0).setLector(lectors.get(0));
		courses.get(0).setStudents(students);
		Helper.showAll(courses, students, lectors);
		Helper.showDescriptionOfCourse(courses, 0);
		Helper.showLectionsByDate(lections, lections.get(0).getDate());
		Helper.sortCourse("alphabet", courses);
		Helper.sortCourse("students count", courses);
		Helper.sortLectionsOfCourse("date", courses, 0);
		Helper.sortLector("alphabet", lectors);
	}
}
