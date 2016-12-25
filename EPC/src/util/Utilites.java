package util;

import java.util.ArrayList;

import model.Course;
import model.Student;

public class Utilites {
	public static String showStudents (Course course) {
		ArrayList<Student> students = course.getStudents();
		String s = "";
		for (int i=0;i<students.size();++i) {
			s+=students.get(i).getName()+", ";
		}
		return s;
	}
}
