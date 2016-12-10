package model;

public class Course extends Abstract{

private String informationOfCourse;
private Lection[] lections;
private Student[] students;
private Lector lector;
public Course(String name, String information){
	super.setName(name);
	informationOfCourse=information;
}
public Lection[] getLections() {
	return lections;
}
public void setLections(Lection[] lections) {
	this.lections = lections;
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
public Student[] getStudents() {
	return students;
}
public void setStudents(Student[] students) {
	this.students = students;
}
}