package model;

public class Student extends Human {
	private Course course;

	@Override
	public Role getRole() {
		return Role.LISTENER;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}
