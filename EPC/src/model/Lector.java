package model;

import java.util.ArrayList;

public class Lector extends Human{
	
	private ArrayList<Course> courses;
	public Lector(String fio) {
		super(fio);
	}
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
