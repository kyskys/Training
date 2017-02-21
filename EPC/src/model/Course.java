package model;

import java.util.ArrayList;

import annotation.PrintableModel;

@PrintableModel(name = "courses")
public class Course extends BaseModel {

	private String informationOfCourse;
	private ArrayList<Lection> lections = new ArrayList<Lection>();
	private ArrayList<Student> students = new ArrayList<Student>();
	private Lector lector;

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

	public void addLection(Lection lection) {
		lections.add(lection);
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public void deleteLection(Lection lection) {
		lections.remove(lection);
	}

	public void deleteStudent(Student student) {
		students.remove(student);
	}
}