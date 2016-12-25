package model;

import java.util.ArrayList;

public class Lector extends Human{
	
	private ArrayList<Course> courses;
	public Lector(String fio) {
		super(fio);
		super.setRole(Role.LECTOR);
	}
	public ArrayList<Course> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

}
