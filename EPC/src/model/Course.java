package model;

import java.util.ArrayList;

public class Course extends BaseModel {

	private String informationOfCourse;
	private ArrayList<Lection> lections;
	private ArrayList<Student> students;
	private Lector lector;

	public Course(String name, String information) {
		setName(name);
		informationOfCourse = information;
	}

	public Course() {

	}

	public Lector getLector() {
		return lector;
	}

	public void setLector(Lector lector) {
		this.lector = lector;
	}

	public String getInformationOfCourse() {
		return informationOfCourse;
	}

	public void setInformationOfCourse(String informationOfCourse) {
		this.informationOfCourse = informationOfCourse;
	}

	public ArrayList<Lection> getLections() {
		return lections;
	}

	public void setLections(ArrayList<Lection> lections) {
		this.lections = lections;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
}