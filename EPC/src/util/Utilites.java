package util;

import java.util.ArrayList;
import java.util.Date;

import model.*;

public class Utilites {
	public static void showStudents (Course course) {
		ArrayList<Student> students = course.getStudents();
		StringBuilder s = new StringBuilder();
		for(Student stud : students) {
			s.append(stud.getName());
		}
		System.out.println(s);
	}
	public static ArrayList<Course> weedCourseByDate (ArrayList<Course> courses, String select) {
		
		ArrayList<Course> n = new ArrayList<Course>();
		switch(select) {
		case("before"): {
			for (Course c : courses) {
				if (c.getLections().get(0).getDate().before(new Date())) {
					n.add(c);
				}
			}
		}
		case ("after"): {
			for (Course c : courses) {
				if (c.getLections().get(0).getDate().after(new Date())) {
					n.add(c);
				}
			}
		}
		}
		return n;
	}
}
