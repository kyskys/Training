package model;
import java.util.Date;

public class Lection extends BaseModel{
private Date date;
private Course course;
public Lection (String name, Date date){
	setName(name);
	setDate(date);
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public Course getCourse() {
	return course;
}
public void setCourse(Course course) {
	this.course = course;
}
}
