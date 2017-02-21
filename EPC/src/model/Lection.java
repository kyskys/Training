package model;

import java.util.Date;

import annotation.PrintableModel;

@PrintableModel(name = "lections")
public class Lection extends BaseModel {
	private Date date;
	private Course course;

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
