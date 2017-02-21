package model;

import java.util.ArrayList;

import annotation.PrintableModel;

@PrintableModel(name = "lectors")
public class Lector extends Human {

	private ArrayList<Course> courses = new ArrayList<Course>();

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	@Override
	public Role getRole() {
		return Role.LECTOR;
	}

	public void addCourse(Course course) {
		courses.add(course);
	}

	public void deleteCourse(Course course) {
		courses.remove(course);
	}
}
