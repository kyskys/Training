package util;

import java.util.ArrayList;
import java.util.Date;

import model.*;

public class Utilites {
	public static String showStudents (Course course) {
		ArrayList<Student> students = course.getStudents();
		String s = "";
		for (int i=0;i<students.size();++i) {
			s+=students.get(i).getName()+", ";
		}
		return s;
	}
	public static void showCoursesAfterSort(ArrayList<Course> abs) {
		for(int i=0;i<abs.size();++i) {
			System.out.println(abs.get(i).getName());
		}
	}
	public static void showLectionsAfterSort(ArrayList<Lection> abs) {
		for(int i=0;i<abs.size();++i) {
			System.out.println(abs.get(i).getName());
		}
	}
	public static void showLectorsAfterSort(ArrayList<Lector> abs) {
		for(int i=0;i<abs.size();++i) {
			System.out.println(abs.get(i).getName());
		}
	}
	public static ArrayList<Course> weedCourseByDateAfter (ArrayList<Course> courses, Date date) {
		ArrayList<Course> n = new ArrayList<Course>();
		for(int i=0;i<courses.size();++i) {
			Course term = courses.get(i);
			if (term.getLections().get(0).getDate().after(date)) {
				n.add(term);
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
