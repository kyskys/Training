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
	public static <T extends Abstract> void  showAfterSort(ArrayList<T> abs) {
		for(Abstract a : abs) {
			System.out.println(a.getName());
		}
	}
	public static ArrayList<Course> weedCourseByDateAfter (ArrayList<Course> courses, String select) {
		
		ArrayList<Course> n = new ArrayList<Course>();
		switch(select) {
		case("before"): {
			for (Course c : courses) {
				if (c.getLections().get(0).getDate().after(date)) {
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
	public static ArrayList<Course> weedCourseByDateBefore (ArrayList<Course> courses) {
		ArrayList<Course> n = new ArrayList<Course>();
		Date date = new Date();
		for(int i=0;i<courses.size();++i) {
			Course term = courses.get(i);
			if (term.getLections().get(0).getDate().before(date)) {
				n.add(term);
			}
		}
		return n;
	}
}
