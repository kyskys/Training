package classes;

public class Course {
	
private String nameOfCourse;
private String informationOfCourse;
private Lection[] lections;
private Lector lector;
public Course(){
	
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
public String getNameOfCourse() {
	return nameOfCourse;
}
public void setNameOfCourse(String nameOfCourse) {
	this.nameOfCourse = nameOfCourse;
}
public String getInformationOfCourse() {
	return informationOfCourse;
}
public void setInformationOfCourse(String informationOfCourse) {
	this.informationOfCourse = informationOfCourse;
}
}