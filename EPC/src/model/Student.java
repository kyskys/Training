package model;

public class Student extends Human {
	private Course course;

	public Student(String fio) {
		super(fio);
	}

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
