package model;

import java.util.ArrayList;

import annotation.PrintableModel;

@PrintableModel(name = "lectors")
public class Lector extends Human {

	private ArrayList<Course> courses;

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

}
